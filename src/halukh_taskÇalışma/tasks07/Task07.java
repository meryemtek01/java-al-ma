package halukh_taskÇalışma.tasks07;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("String i yazınız : ");
        String str = scan.nextLine();
        System.out.print("istenilen index : ");
        int index = scan.nextInt();

        if (index>=0 && index<str.length()) System.out.println(str.substring(index,index+1));
        else System.out.println("Hatalı index");

// hasan, 2


    }
}
