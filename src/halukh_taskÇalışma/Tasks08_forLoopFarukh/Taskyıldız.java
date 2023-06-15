package halukh_taskÇalışma.Tasks08_forLoopFarukh;

import java.util.Scanner;

public class Taskyıldız {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir boyut giriniz");
        int row = input.nextInt();
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < row-1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        }
}
