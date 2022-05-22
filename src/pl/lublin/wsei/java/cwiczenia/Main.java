package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.cwiczenia.mylib.Account;
public class Main {

    public static void main(String[] args) {

        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.println(acc.getName());
        System.out.printf("%s%n ", Account.capitalize("stanisŁaw maruSARz"));


        String name = "Амелия Sidorov"; // Amelia Sidorowa
        System.out.printf(Account.translit(name));

        name = "Алиця Smirnov"; //Alicja Smirnoff
        System.out.printf(Account.translit(name));

        name = "Александра Михайлов"; ///Aleksandra Michajłow
        System.out.printf(Account.translit(name));

        name = " Агнешка Козлов"; // Agnieszka Kozłow
        System.out.printf(Account.translit(name));

        name = "Бартош никитин"; // Bartosz Nikitin
        System.out.printf(Account.translit(name));



        name ="Melnyk";
        System.out.printf(Account.translit(name) + "\n");
        name ="Shevchenko";
        System.out.printf(Account.translit(name) + "\n");
        name ="Bondarenko";
        System.out.printf(Account.translit(name) + "\n");
        name ="Kovalenko";
        System.out.printf(Account.translit(name) + "\n");
        name ="Boyko";
        System.out.printf(Account.translit(name) + "\n");
        name ="Tkachenko";
        System.out.printf(Account.translit(name) + "\n");


    }


}