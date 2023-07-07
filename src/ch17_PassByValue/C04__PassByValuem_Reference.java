package ch17_PassByValue;

public class C04__PassByValuem_Reference {
    static double etiketFiyati;// güneş ay yıldız
    static double indirimOrani;//güneş ay yıldız

    public static void main(String[] args) {
        etiketFiyati = 100;
        System.out.println("etiketFiyati = " + etiketFiyati);//etiketFiyati = 100.0

        indirimOrani = 0.1;

        indir();//methodcall etiket fiyatı method içinde 90.0
        indir();//methodcall etiket fiyatı method içinde 81.0
        indir();//methodcall etiket fiyatı method içinde 72.9

        System.out.println("method call sonrası etiketFiyati = " + etiketFiyati);//method call sonrası etiketFiyati = 72.9


    }//main sonu

    private static void indir() {
        etiketFiyati *= (1 - indirimOrani); //etiket fiyatı indirimli hale geldi
        System.out.println("etiket fiyatı method içinde "+etiketFiyati);
    }
}


