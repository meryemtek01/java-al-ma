package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        String pin = "fethiye1234";
        int girisHakkı = 3;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("pin giriniz");
            String girilenPin = input.nextLine();
            if (girilenPin.equals(pin)) {
                System.out.println("pin dogru");
                break;

            } else {
                System.out.println("yanlış pin");
                girisHakkı--;
            }
            if (girisHakkı == 0) {
                System.out.println("tüm hakkın bitti");
                break;
            }
        }
        System.out.println("*** for loop ****");

        String correctPin = "1234";
        int maxAttempts = 3;

        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("PIN kodunu girin: ");
            String pin1 = scanner.nextLine();

            if (pin1.equals(correctPin)) {
                System.out.println("PIN doğru.");
                break;
            } else {
                System.out.println("PIN yanlış.");
                if (attempt < maxAttempts) {
                    System.out.println("Tekrar deneyin.");
                }
            }
        }

        scanner.close();
    }
}