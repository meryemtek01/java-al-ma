package ch07_StringMain;

public class C09_replace_replaceAll {
    public static void main(String[] args) {
/** replace()
 * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
 * (update -set) saglar. Sonuc String'dir..
 *
 */

        String str = "ezberlemek beyne ihanettir 12356 ^#^%$ () :";

        System.out.println("(str.replace('a', '$') "+str.replace('a', '$'));
       //System.out.println("str.replace('tir', '*') "+str.replace('tır', '*'));
        System.out.println("str.replaceAll(\"\\\\w\",\"*\");\n " +str.replaceAll("\\w", "*"));//********* ***** ********* ***** ^#^%$ () :

        //sadece harfleri yıldıza çevirin
        System.out.println("str.replaceAll(\"[A-Za-z]\", \"* \") "+str.replaceAll("[A-Za-z]", "*"));//str.replaceAll("[A-Za-z]", "* ") ********** ***** ********* 12356 ^#^%$ () :

//task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki
// formatta print eden code create ediniz.

// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234
 String isim="Meryem";
 String soyisim="hanım";
 String kartno="1234567891234";
 String yeniisimciktisi=isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        System.out.println("yenisimçıktısı="+yeniisimciktisi    );//yenisimçıktısı=M*****


        String yenisoyisimciktisi=soyisim.charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println("yenisoyisimcıktısı="+ yenisoyisimciktisi);//yenisoyisimcıktısı=h**ı*


        String yenikartnociktisi="**** **** ****"+ kartno.substring(12);
        System.out.println("yenikartnocıktısı="+yenikartnociktisi);//yenikartnocıktısı=**** **** ****4

        String yenikartnoRegex=kartno.substring(0,12).replaceAll("[0-9]","*")+kartno.substring(12);
        System.out.println("yenikartnoRegex="+yenikartnoRegex);
    }
}
