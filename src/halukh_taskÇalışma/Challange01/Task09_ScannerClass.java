package halukh_taskÇalışma.Challange01;

import java.util.Scanner;

public class Task09_ScannerClass {
    public static void main(String[] args) {
        //  Girilen yaricap değeri için cemberin cevresini ve dairenin alanini print eden code create ediniz. (pi =3.14)

        Scanner input = new Scanner(System.in);
        System.out.print("Gardaş hele yarıçap giresen : ");
        int yarıCap = input.nextInt();
        double pi = 3.14;
        System.out.println("çember cevresi : " + (yarıCap * 2 * pi)+"\ndaire alanı : "+ (yarıCap * yarıCap*pi));


    }
}
