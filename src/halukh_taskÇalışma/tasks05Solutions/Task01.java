package halukh_taskÇalışma.tasks05Solutions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        Scanner oku = new Scanner(System.in);
        System.out.print("Yaş ? : "); int yas = oku.nextInt();
        if (yas>=0 && yas<=4 ) System.out.println("bebek");
        else if (yas>=5 && yas<=12 ) System.out.println("cocuk");
        else if (yas>=13 && yas<=20 ) System.out.println("genc");
        else if (yas>=21 && yas<=30 ) System.out.println("yetiskin");
        else System.out.println("tanımlanmamış evre");


    }
}
