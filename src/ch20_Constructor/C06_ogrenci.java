package ch20_Constructor;

public class C06_ogrenci {

    //fields
   String isim="zeynep";
    int yas;
    String name;
    int age;

    public C06_ogrenci(String isim, int yas) {
        //this.isim=isim;
        //this.yas=yas;
//this'leri yoruma aldigimiz icin zeynep hanim (default deger) olur diye dusunmustum ben
        isim=isim;
        yas=yas;
        name=isim;
        age=yas;
        System.out.println("isim = " + isim);//furkan
        System.out.println("this.isim = " + this.isim);//zeynep
        System.out.println("name = " + name);//furkan

    }

    public C06_ogrenci() {

    }






}
