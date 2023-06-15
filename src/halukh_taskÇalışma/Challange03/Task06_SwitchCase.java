package halukh_taskÇalışma.Challange03;

import java.util.Scanner;

public class Task06_SwitchCase {
    /*  Task->
         * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
         * ornek
         *  Kullanici  : A , B , C harflerinden birini secsin
             A'yi secmis ise, ==> Java is easy
             B'yi secmis ise, ==> Java is fun
             C'yi secmis ise, ==> I need to study :)
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bizim ooolan ilk 3  harf değerinden birini giriniz :");
        // char harf = input.next().toUpperCase().charAt(0);


        //  switch (harf) {
        switch (input.next().toUpperCase().charAt(0)) {

            case 'A':
                System.out.println("Java is easy");
                break;
            case 'B':
                System.out.println("Java is fun");
                break;
            case 'C':
                System.out.println("I need to study :)");

            default:
                System.out.println("hatalı girdin javaTAR :( ");

        }
    }
}
