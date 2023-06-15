package tasks03;

import java.util.Scanner;

public class Task01T {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78 vie notu
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter mid-term grade(vize notu)");
        int midTerm=scan.nextInt();
        System.out.println("Enter project grade()");
        int project=scan.nextInt();
        System.out.println("Enter mid-term grade(final)");
        //int final=scan.nextInt();
        //double islem=midTerm*0.30+project*0.2+final*0.5;
       // System.out.println("sonuç="+islem);

    }
}

