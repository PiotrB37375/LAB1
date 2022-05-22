package pl.lublin.wsei.java.cwiczenia;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String leftPad (String aText,char aChar, int aWidth){
        String res=aText;
        for (int i = 0; i <  aWidth - aText.length(); i++) {
            res=aChar+res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0;
        do{
            System.out.print("Podaj liczbę: ");
            num1 = input.nextInt();

            String num1BIN=Integer.toBinaryString(num1);
            num1BIN = leftPad(num1BIN,'0',10);

            String num1Hex=Integer.toHexString(num1);
            num1Hex = leftPad(num1Hex,'0',10);

            System.out.printf(" „DEC = %d, BIN = %s, HEX=%s” \n",num1,num1BIN,num1Hex.toUpperCase());

        }while(true);



    }
}