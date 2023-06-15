package halukh_taskÇalışma.tasks07;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("String i yazınız : ");
        String str = scan.next();

        String birinci = str.substring(0,1);
        String ikinci = str.substring(1,2);
        String ucuncu = str.substring(2,3);

        String result = !birinci.equals(ikinci) && !birinci.equals(ucuncu) && !ikinci.equals(ucuncu) ?
        "Unique" :"non unique";
        System.out.println(result);

    }
}