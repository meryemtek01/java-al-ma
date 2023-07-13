package ch20_Constructor;

public class C07_OgretmenRunner {
    public static void main(String[] args) {

        C07_Ogretmen ogretmen=new C07_Ogretmen("iclal hanım",25);

        System.out.println("ogretmen.isim = " + ogretmen.isim);//ogretmen.isim = iclal hanım
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);//ogretmen.tecrube = 25
        System.out.println("ogretmen.kiden = " + ogretmen.kiden);//ogretmen.kiden = 0

        ogretmen.idemHesap(12);
        //kiden=24
        //this.kiden=0

    }


}
