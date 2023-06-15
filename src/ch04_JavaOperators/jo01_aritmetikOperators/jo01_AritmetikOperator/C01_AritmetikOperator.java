package ch04_JavaOperators.jo01_aritmetikOperators.jo01_AritmetikOperator;

public class C01_AritmetikOperator {
    public static void main(String[] args) {
        //nt a=3;
        //nt b=5;
        //nt c=7;
        //ystem.out.println();
        //nt g=2;
        //nt h=3;
        //tring str= "javascript";
        //ystem.out.println((h+h)+str+" "+(g*h)+""+(g-h));
        int a = 3;
        int b = 5;
        int c = 7;

        System.out.println(b + a * c);//26
        System.out.println(c - a / (c-b) + a*b);//21


        int g = 2;
        int h = 3;
        String str = "Java";

        System.out.println( (h+h) + str + " " + ( g * h ) + " " + ( g- h)   );//6Java 6 -1


    }
}
