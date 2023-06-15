package halukh_taskÇalışma.Challange02;

public class Task01_Modulus {

    public static void main(String[] args) {//main scop
        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru print eden code create ediniz.
        // Hint: use / and %
        //    input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int sayi = 12345;
        int birler = sayi % 10;// 5

        int onlar=(sayi/10)%10;// 4
        int yüzler=(sayi/100)%10;//3
        int binler=(sayi/1000)%10;//2
        int onbinler=(sayi/10000);//1


        System.out.println("birler : " + birler+"\nonlar : "+onlar+"\nyüzler : "+yüzler+"\nbinler : " + binler+"\nonbinler : "+onbinler);


    }// main sonu
}// Class sonu
