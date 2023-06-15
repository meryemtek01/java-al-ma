package halukh_taskÇalışma.Challange01;

import java.util.Scanner;

public class Task07_Converting {

    public static void main(String[] args) {

/*  task->
         girilen sıcaklık değerini Fahrenhayt'tan Santigrat derecesine çeviren code create ediniz.
         formül
         c = (f-32)*5/9
     */

        Scanner input = new Scanner(System.in);//Scanner Class'dan  kalvte girişini input obj atayan bir obj create edildi
        System.out.print("agam hele bir ıscaklığını giresen : ");
        double aganınIscaklıgı = input.nextDouble();
        double aganınIscaklıkderecresi=(aganınIscaklıgı-32)*5/9;
        System.out.println("agam ıscaklıgın derecesi : "+((aganınIscaklıgı-32)*5/9));
        System.out.println("agam ıscaklıgın derecesi : "+aganınIscaklıkderecresi);


    }
}
