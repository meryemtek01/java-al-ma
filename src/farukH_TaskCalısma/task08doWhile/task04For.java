package farukH_TaskCalısma.task08doWhile;

public class task04For {
    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */



        //    //FARKLI ŞEKİL
        char karakter = 65;
        for (int i = 0; i <= 5; i++) {//satır
            for (int j = 0; j <= i; j++) {//sütun
                System.out.print((char)(i+karakter)+" ");//j+
            }
            System.out.println();
        }

        System.out.println();
        //TASK ın çözümü
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(i+karakter)+" ");//i
            }
            System.out.println();
        }
        System.out.println();
        //HOCANIN ÇÖZÜMÜ
        int harf=65;
        for (int i = 1; i < 6 ; i++) {

            for (int j = 0; j <= i ; j++) {//yine icteki loop a i kadar calis dedik
                System.out.print( (char) ( harf + i )+" ");// i yi j kadar yazdirdi ayni satira. hep i yi yazdik


            }
            System.out.println();
        }




    }
}

