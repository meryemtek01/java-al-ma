package ch17_PassByValue;

public class C05__PassByValuem_Reference {
    public static void main(String[] args) {
        double etiketFiyati=100;
        double indirimOrani=0.1;

        System.out.println("indirim öncesi etiket fiyatı " + etiketFiyati);//indirim öncesi etiket fiyatı 100.0

        etiketFiyati=indirim(etiketFiyati,indirimOrani); //method içinden etiketFiyati = 90.0


        System.out.println("indirim sonrası etiket fiyatı " + etiketFiyati);//indirim sonrası etiket fiyatı 90.0


    }//main sonu

    private static double indirim(double etiketFiyati, double indirimOrani) {
        etiketFiyati*=(1-indirimOrani);

        System.out.println("method içinden etiketFiyati = " + etiketFiyati);//method içinden etiketFiyati = 90.0

return  etiketFiyati;
    }
}
