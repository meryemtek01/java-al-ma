package ch17_PassByValue;

public class C02_PassByValuem_Reference {

    public static void main(String[] args) {

        double fiyat = 100;
        System.out.println("method call öncesi fiyat = " + fiyat);//method call öncesi fiyat = 100.0

        System.out.println("indirim11(fiyat) = " + indirim11(fiyat));//indirim11(fiyat) = 89.0
        System.out.println("indirim22(fiyat) = " + indirim22(fiyat));//indirim22(fiyat) = 78.0
        System.out.println("indirim33(fiyat) = " + indirim33(fiyat));//indirim33(fiyat) = 67.0

        System.out.println("method call ettikten sonra fiyat = " + fiyat);//method call ettikten sonra fiyat = 100.0

    }//main sonu

    private static double indirim33(double fiyat) {

        return fiyat*=0.67;
    }

    private static double indirim22(double fiyat) {
        return fiyat*=0.78;

    }

    private static double indirim11(double fiyat) {
        return fiyat*=0.89;

    }

}
