package halukh_taskÇalışma.Challange04;

import java.util.Scanner;

public class Task09 {
    /* Task->
     Girilen bir kelimede  tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
     * kelimenin ortasindaki karakteri print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bizim ooolan bi kelime giresen :");

        String kelime = input.next();

        if (kelime.length()%2==1 &&  kelime.length()>=3) { //kelime karakter sayısı tek ve 3veya daha çok olma şartı
            System.out.println("orta karakter : "+kelime.charAt(kelime.length() / 2));// kelimenin orta karakteri cvahrAT e parametre girdi
        }else System.out.println("dewamkeee  :)");
    }
}
