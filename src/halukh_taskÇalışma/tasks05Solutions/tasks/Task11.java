package halukh_taskÇalışma.tasks05Solutions.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Task->
           girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("agam yıl giresen : ");
        int yil = input.nextInt();
        System.out.println("   ***  if blok   ***   ");
        // 4'un katı       100'un katı olmaması    400'un katı olması
        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {

            System.out.println("girilen yıl ARTIK YIL'dır");

        } else System.out.println("girilen yıl artık yıl değildir..");


        System.out.println("   ***  ternary blok   ***   ");
        // condition(şart)  ?(if-ise) şart true olunca yapılacak action    :   (else-değilse) şart false olunca yapılacak action
        System.out.println(yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0) ? "girilen yıl ARTIK YIL'dır" : "girilen yıl artık yıl değildir..");

    }
}