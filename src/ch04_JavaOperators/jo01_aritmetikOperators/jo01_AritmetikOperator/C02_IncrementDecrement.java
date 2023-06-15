package ch04_JavaOperators.jo01_aritmetikOperators.jo01_AritmetikOperator;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        //t number = 7;
        //pre increment
        //stem.out.println(++number);//8 önce arttırdım sonra yazdırdık
        //post increment
        //stem.out.println(number++);//8 önce yazdır sonra arttır

        //stem.out.println(number);//9

        //stem.out.println(number++ + ++number);// 9+11= 20

        //stem.out.println(number);//11
        //stem.out.println(number++ + number++);//11+12 =23

        int number = 7;

        //pre increment
        System.out.println(++number);//8

        System.out.println("number = " + number);//number = 8

        //post increment
        System.out.println(number++);//8

        //postincrement sonrasi deger guncelllendi

        System.out.println("number = " + number);//number = 9

        System.out.println(  number++   +   ++number  );//20

        System.out.println("number = " + number);// number = 11

        System.out.println(number++   +  number++);// 11 + 12  = 23 ;
        //The value changed at 'number++' is never used
    }
}
