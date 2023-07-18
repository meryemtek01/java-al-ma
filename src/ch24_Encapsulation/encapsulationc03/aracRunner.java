package ch24_Encapsulation.encapsulationc03;

public class aracRunner {

    public static void main(String[] args) {
        arac arac1=new arac("tesla","blue",900,2023);
        arac arac2=new arac();

        arac arac3=new arac();
        arac3.setModel("Merso");
        arac3.setRenk("red");
        arac3.setMotor(800);
        arac3.setYil(1923);

        System.out.println("arac1 = " + arac1);
        System.out.println("arac2 = " + arac2);
        System.out.println("arac3 = " + arac3);


    }
}
