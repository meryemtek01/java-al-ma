package halukh_taskÇalışma.task03Solutions;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*TASK->
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner oku = new Scanner(System.in);
        System.out.print("Gunluk kaç saat uyursunuz? : "); int uyku  = oku.nextInt();
        System.out.println("Ayda "+(uyku*30/24.0)+" gün uykuda geçiriyorsunuz");
        System.out.println("Yılda "+(uyku*365/24.0)+" gün uykuda geçiriyorsunuz");
        System.out.println("40 Yılda "+(uyku*365*40/24.0)+" gün uykuda geçiriyorsunuz");


    }
}
