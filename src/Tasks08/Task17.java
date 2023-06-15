package Tasks08;

public class Task17 {

    public static void main(String[] args) {

        /*
        task->  0 ile 100 arasındaki hem 5'e, hem de 4'e tam bölünebilen  sayıları print eden code create edinz.

         */
        for (int i = 1; i <100 ; i++) {
            if (i%20 ==0) { // veya (i%5 == 0 and i%4 == 0)
                System.out.print(i+" ");
            }
        }// 20 40 60 80

    }
}
