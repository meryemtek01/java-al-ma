package ch20_Constructor;

public class C07_Ogretmen {
    //fields

    String isim;
    int tecrube;
    int kiden;

    public C07_Ogretmen(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube=tecrube;
    }




   public  void idemHesap(int kiden){

       System.out.println("(kiden*2 ) = " + (kiden * 2));//method dan gelen int degerini alır

       System.out.println("this.kiden = " + this.kiden);//int variable
   }


}
