package pl.lublin.wsei.java.cwiczenia;

public class Main {
    public static void main(String[] args) {
        // Pkt 7.
        System.out.print("Ala \n");
        System.out.print("ma \n");
        System.out.print("kota. \n");

        int a =3;
        double b = 3.45d;
        String tekst = " jakiśtekst";
        System.out.printf("a= %d, b= %f ,tekst = %s %n",a,b,tekst);

        System.out.printf("a= %d, b= %.2f ,tekst = %20s %n",a,b,tekst);
        System.out.printf("Nazywaliśmy to \"witaminą B3\" \n \n");

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i+=10) {
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        }

        // Math.log(logNumber)/Math.log(base);

        System.out.printf("\n\n arg \t log2(arg) \t sum(arg) \n");
        double temp =0;
        for (int i = 0; i < 15; i+=1) {
            int result= (int)Math.pow(2,i);
            double suma=temp+result;
            temp=suma;
            System.out.printf("%d \t %.02f\t %.02f\t \n", i, Math.log(i)/Math.log(2),suma );
        }


    }



}