package Tasks08;

import java.util.Scanner;

public class
Task37 {
    public static void main(String[] args) {

        /*
 Type code to ask user to enter the number of row
 and print the shape below according to that number:

       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *
      ***
      ***
      ***
      ***
      ***
  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++) {//Row Control
            for (int k = 0; k <row-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {//Column Control
                System.out.print("* ");

            }

            System.out.println();
        }

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <row-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }


    }
}

