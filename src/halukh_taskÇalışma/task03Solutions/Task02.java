package halukh_taskÇalışma.task03Solutions;

import java.util.Scanner;

public class Task02 {
    /* TASK ->
     * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
     * ve vucut kutle endeksini bulun.
     * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
     *
     * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
     *
     * Ornek : Input : boy :180 kilo : 80
     *         Output : Vucut kutle endeksiniz : 24
     *                  Vucut kutle endeksiniz : 24.691…
     */
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Boy (cm) : "); double boy = oku.nextInt();
        System.out.print("Kilo (kg): "); int kilosu = oku.nextInt();
        boy = boy / 100;
        double vke = kilosu/(boy*boy);
        System.out.println(vke);
        int vkeInt = (int) vke;
        System.out.println(vkeInt);



    }
}
