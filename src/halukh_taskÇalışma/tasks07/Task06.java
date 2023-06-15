package halukh_taskÇalışma.tasks07;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("String i yazınız : ");
        String str = scan.nextLine();  // hasan

        str = str.substring(0,str.length()-1);
        System.out.println(str);



    }
}
