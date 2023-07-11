package ch19_StringBuilder_method;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {
      /*  StringBuilder sb = new StringBuilder();
        sb.append("Merhaba");
        sb.append(" ");
        sb.append("Dünya!");

        System.out.println(sb.toString()); // Çıktı: Merhaba Dünya!

        sb.insert(8, "Sevgili ");
        System.out.println(sb.toString()); // Çıktı: Merhaba Sevgili Dünya!

        sb.delete(0, 8);
        System.out.println(sb.toString()); // Çıktı: Sevgili Dünya!

       */
/*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder
Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

    */
String str="javaaslan";
        System.out.println("method öncesi="+str);
        strBirlestir(str);
        System.out.println("method sonrası="+str);
        // task -> 50000 tekrarlı bir loop ile String ve StringBuilder obj run time
// surelerini karsılatırın
        int iterationCount = 50000;

        long startTime = System.currentTimeMillis();
        String resultString = testString(iterationCount);
        long endTime = System.currentTimeMillis();
        long stringTime = endTime - startTime;

        startTime = System.currentTimeMillis();
     //   String resultStringBuilder = testStringBuilder(iterationCount);
        endTime = System.currentTimeMillis();
        long stringBuilderTime = endTime - startTime;

        System.out.println("String süresi: " + stringTime + " milisaniye");
        System.out.println("StringBuilder süresi: " + stringBuilderTime + " milisaniye");

        String s="a";
        StringBuilder sb1=new  StringBuilder("");
        LocalTime str1Basla=LocalTime.now();
        System.out.println("str1Basla = " + str1Basla);
        for (int i = 0; i < 50000; i++) {
            s+=i;

        }
        LocalTime str1Bitti=LocalTime.now();
        System.out.println("str1Bitti = " + str1Bitti);
        System.out.println("fark  " +( str1Bitti.getNano() - str1Basla.getNano()));



    }

    private static String testString(int iterationCount) {
        String result = "";
        for (int i = 0; i < iterationCount; i++) {
            result += "test";
        }
        return result;
    }



    private static void strBirlestir(String str) {
        System.out.println(str+"  selam methoddan sonrası");
    }
}
