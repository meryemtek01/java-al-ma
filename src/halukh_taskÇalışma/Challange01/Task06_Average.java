package halukh_taskÇalışma.Challange01;

public class Task06_Average {// Class scope

    public static void main(String[] args) {// main scope
            /* task->
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        bu double sayilarin ortalamasini bulunuz

     */

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
        double toplam = num1 + num2 + num3 + num4 + num5;
        double ortalama = toplam / 5;


        System.out.println("girilen sayıların ortlaması : " + (num1 + num2 + num3 + num4 + num5) / 5);// 4701.9400000000005
        System.out.println("girilen sayıların ortlaması : " + ortalama); // 4701.9400000000005


    }//main sonu
}// class sonu
