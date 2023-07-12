package ch20_Constructor;

public class C02_arac {
    //fields
    String marka;
    String model;
    int km;
    double motorHacmi;
    boolean vitesAuto;
    boolean ikiciEl;
    int yil;
    String tramer;




    public static void main(String[] args) {

        C02_arac arac1=new C02_arac();//pm siz const.kullanılarak arac1 objesi create edildi.

        arac1.ikiciEl=true;
        arac1.marka="mercedes";
        arac1.km=50000;
        arac1.model="CLA";
        arac1.motorHacmi=2.0;
        arac1.tramer="5 kaza var";
        arac1.yil=2022;


        System.out.println("arac1 = " + arac1);//arac1 = ch20_Constructor.C02_arac@566776ad referans degeri objenin

        System.out.println(arac1.marka+" "+arac1.tramer+" "+ arac1.ikiciEl+" "+arac1.km+" "+arac1.model+" "+arac1.motorHacmi+" "+ arac1.yil);

//mercedes 5 kaza var true 50000 CLA 2.0 2022

//task -> 2. bir aracın tum field'larını atayarak print ediniz.

        C02_arac arac2 = new C02_arac();

        arac2.ikiciEl= false;
        arac2.marka = "volvo";
        arac2.km = 0;
        arac2.model = "x";
        arac2.motorHacmi =4.0;
        arac2.tramer = "kazasız";
        arac2.yil = 2023;


    }

    @Override//hint bellekten veri alma classın dısına cıkarak sag clık -> generetare ->tostring
    public String toString() {
        return "C02_arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikiciEl=" + ikiciEl +
                ", yil=" + yil +
                ", tramer='" + tramer + '\'' +
                '}';
    }
}
