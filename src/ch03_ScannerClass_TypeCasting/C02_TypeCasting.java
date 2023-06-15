package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
       /* boolean basarilimi= true;
        String basari=String.valueOf(basarilimi);//boolen olan bir degeri stringe çevrildi
        System.out.println("basarılı "+basari  );//basarılı true

        double d=17;// double conteiner int olan 17 degeri atandı
        System.out.println("d="+d);//d=17.0
        int sayi1=33;
        int sayi2=4;
        System.out.println("sayi1/sayi2="+(sayi1/sayi2)); //8 sonuç tamsayı olmasada int olduğu için virgül sonrasını vermez
        //java iki int sayıyı birbirine böldüğümüzde sonucu int olur
   byte by=127;
   int number=by;
   int num=123;
   double d1=14;
   double d2=d1/14;
        System.out.println("d2="+d2);

        double db1=14.66;
        int i= (int) db1;//büyük olan kutu küçük olan kutuya eklemeye calışıldı
        System.out.println("i="+i);
        int n3m=150;
        byte by1= (byte) n3m;
        System.out.println("byte="+by1);*/

       //task
        Scanner input=new Scanner(System.in);//1. adım
        System.out.println("bir karakter giriniz");//2. adım
        char karakter= input.nextLine().charAt(0);//3. adım kullanıcının girdiği ifadenin ilk karakteri alınıp karakter variableatandı

        System.out.println("char= "+(karakter+0));//4.adım 1.yol
        System.out.println("char= "+karakter  );//4.adım 2.yol
        System.out.println("char= "+(int)karakter);//4.adım

        //exstra ascii degeri bulma metodu
        String str="a";//tek karakter girilirse hashCodeile bulunabilinir
        System.out.println("str.hashCode()="+str.hashCode());//


    }
}
