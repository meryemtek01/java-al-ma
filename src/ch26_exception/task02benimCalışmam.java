package ch26_exception;

import java.io.IOException;
import java.util.Scanner;

public class task02benimCalışmam {

    public static void main(String[] args) {

 /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

 */


           Scanner input = new Scanner(System.in);
            System.out.print("Hava sıcaklığını giriniz: ");
            int havasicaklık = input.nextInt();
        try {
            if (havasicaklık < 10) {
                throw new IOException(" Hava sıcaklığı 10°C'nin altında.");
            }

            System.out.println("Hava sıcaklığı uygun.");
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }


    }


    }

