package halukh_taskÇalışma.tasks05Solutions.tasks;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */

        Scanner input = new Scanner(System.in);
        System.out.println("agam vize notu giresen : ");
        int vizeNot = input.nextInt();

        System.out.println("agam ara sınav notu giresen : ");
        int araSinavNot = input.nextInt();

        System.out.println("agam final notu giresen : ");
        int finalNot = input.nextInt();

        double ortalama = (vizeNot + araSinavNot + finalNot) / 3;

        if (ortalama >= 90) {
            System.out.println("agam maaşallah  A class adamsın :) ");
        } else if (ortalama < 90 && ortalama >= 70) {
            System.out.println("agam notun B ");
        } else if (ortalama < 70 && ortalama >= 50) {
            System.out.println("agam notu c");
        } else if (ortalama < 50) {
            System.out.println("agam senden adam olmaz al sana F :( ");
        } else System.out.println("agam adam gibi sayi giresen");


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE


    }
}
