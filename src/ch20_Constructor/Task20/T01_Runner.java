package ch20_Constructor.Task20;

import java.util.Scanner;

public class T01_Runner {

     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan T01_Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("dikdörtgenin yükselliğini girin");//kullanıcıdan  veri aldık
        int length=input.nextInt();

        System.out.println("dikdörtgenin taban genişmiğini girin");
        int width=input.nextInt();//taban genişliği
        T01_Rectangle dikdörtgen=new T01_Rectangle(length,width);// dikdörtgen adında obje ürettik


        System.out.println("dikdörtgen.cevre() = " + dikdörtgen.cevre());
        System.out.println("dikdörtgen.alan() = " + dikdörtgen.alan());

    }


}
