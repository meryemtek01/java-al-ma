package Tasks08;

public class Task31 {

    public static void main(String[] args) {
        /*
            1
            1  2
            1  2  3
            1  2  3  4.

         */
        int input = 8;

        for (int i = 1; i <= input; i++) { // 4 satir oldugu icin outer loop 1-4 arasi olacak

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            System.out.println("");
        }


    }
}
