package ch02_DataTypes_WrapperClass;

public class C01_DataTypessben {
    public static void main(String[] args) {


        //TASK -> 1999 yılında doğan bir kişinin yaşını yazdırınız... variable crate ederek hesaplayiniz hepsini atama yapiniz
        String naame = "hasan bey";
        String yas = "23";
        int dogantarih = 1999;
        int buguntarih = 2023;
        int yasiniz = buguntarih - dogantarih;
        System.out.println("yasınız=" + yasiniz);
        byte sayi1 = 100;
        byte sayi2 = 29;
        byte toplam = (byte) (sayi1 + sayi2);
        System.out.println("toplam=" + toplam);

// Task ad ve soyadınızı ve yasınızı print ediniz.
        String adi = "meryem";
        String soyad = "Tekin";
        int yasi = 46;
        System.out.println(adi + soyad + " " + yasi);

    }
}
