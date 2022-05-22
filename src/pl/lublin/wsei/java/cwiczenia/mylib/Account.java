package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account {
    public static String translit(String arg){
        String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
        String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
                "k","l","m","n","o","p","r","s","t","u","f","h","c",
                "ch","sh","shh","'","ju","ja"};

        arg = arg.toLowerCase();
        String result="";
        for (int i = 0; i < arg.length(); i++) {
            char temp = arg.charAt(i);
            if(StringUtils.indexOf(ukrAlphabet, temp) == -1){
                result +=arg.charAt(i);
            }else{
                result+=translitRepl[StringUtils.indexOf(ukrAlphabet, temp)];

            }
        }
        return capitalize(result);
    }
    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }
    private String name;

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;
    }

}