package tasks03;

import java.util.Scanner;

public class Task03T {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Günlük kaç saat uyursunuz=");
        int uyku=scan.nextInt();
        System.out.println("ayda"+(uyku*30/24.0)+"gün uykuda sgeçiriyorsunuz");
        System.out.println("yılda"+(uyku*365/24.0)+"gün uykuda sgeçiriyorsunuz");
        System.out.println("40 yılda"+(uyku*365*40/24.0)+"gün uykuda sgeçiriyorsunuz");

    }
}
