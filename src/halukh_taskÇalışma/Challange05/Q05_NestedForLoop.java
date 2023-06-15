package halukh_taskÇalışma.Challange05;

import java.util.Scanner;

public class Q05_NestedForLoop {
     /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("satır  giriniz");
        int satir = input.nextInt();

        System.out.println("sütun  giriniz");
        int sutun = input.nextInt();

        for (int i = 1; i <=satir ; i++) {// i=1 ... satır kontrolu
            for (int j = 1; j <=sutun ; j++) {// j=1 ...sutun kontrol
                System.out.print("*"+" ");
            }
            System.out.println();//dummy -! hayalet komut action olmayan satır düzeni sağlar

        }

    }
}
