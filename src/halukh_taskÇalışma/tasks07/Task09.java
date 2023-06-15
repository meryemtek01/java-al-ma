package halukh_taskÇalışma.tasks07;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner scan = new Scanner(System.in);
        System.out.print("String i yazınız : ");
        String str = scan.nextLine();

        System.out.println(str.substring(0,str.length()/2));


    }
}
