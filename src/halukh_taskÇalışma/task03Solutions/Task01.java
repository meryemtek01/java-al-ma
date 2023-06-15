package halukh_taskÇalışma.task03Solutions;

import java.util.Scanner;

public class Task01 {
     /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 90
		      		 project grade = 66
		      OUTPUT: "Your grade is : 81,6"

		 */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Mid-term grade : "); int midTerm = scan.nextInt();
         System.out.print("Project  grade : "); int project = scan.nextInt();
         System.out.print("Final    grade : "); int finalG  = scan.nextInt();
         double result = midTerm*0.30+project*0.2+finalG*.5;
         System.out.println(result);

     }
}
