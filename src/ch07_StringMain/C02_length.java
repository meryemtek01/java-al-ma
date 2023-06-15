package ch07_StringMain;

public class C02_length {
    public static void main(String[] args) {
/*
length() methodu girilrn string'in uzunluğunu:içinde bulunan karakter sayısını return eder
butun karakterleri(boşluk vs) sayıp adedini verir
 */
        String str = "clarusway ile java";
        System.out.println(" str.length()="+str.length());//str.length=18
        //method parantesi boş ise bu method parametresi demektir.
       int lenghtofStr= str.length();
        System.out.println("lenghtofStr="+lenghtofStr);
        String str1="";
        System.out.println(" str1.lenght="+str1.length());
        String str2=" ";
        System.out.println(" str2.lenght="+str2.length());
        //String str3=null;
        //System.out.println("str3.lenght()="+str3.length());
//Exception in thread "main" java.lang.NullPointerException

        String str4="null";
        System.out.println("str4.lenght()="+str4.length());//str4.lenght()=4
        System.out.println("str4= "+str4);//str4=null
        String str5;//atama yapılmamış bir varebeil
    }
}
