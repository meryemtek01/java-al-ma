package ch20_Constructor;

public class C06_ogrenciRunner {
    public static void main(String[] args) {

        C06_ogrenci ogrenci=new C06_ogrenci("furkan bey",35);

        System.out.println("********************************");
        System.out.println("ogrenci.isim = " + ogrenci.isim);// zeynep
        System.out.println("ogrenci.yas = " + ogrenci.yas);//ogrenci.yas = 0
        System.out.println("ogrenci.age = " + ogrenci.age);//ogrenci.age = 35
        System.out.println("ogrenci.name = " + ogrenci.name);//ogrenci.name = furkan bey

    }
}
