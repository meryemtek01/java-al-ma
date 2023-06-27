package halukh_taskÇalışma.project;

import java.util.Random;
import java.util.Scanner;

public class tas_makas {


    static Random rnd = new Random();
    static Scanner input = new Scanner(System.in);
    static int pcToplam;
    static int kullanıcıToplam;


        public static void main(String[] args) {//main bası
            System.out.println("--------Oyunumuza Hosgeldiniz----------");
            oyunBasladı();

        }//main sonu

        private static void oyunBasladı() {
            while ((kullanıcıToplam != 3 && pcToplam != 3)) {
                int kullanici = kullaniciGirisi();
                int pc = rastgeleSayı();
                System.out.println("pc = " + pc);

                switch (kullanici) {
                    case 1:
                        if (pc == 1) {
                            System.out.println("Berabere...");

                        } else if (pc == 2) {
                            System.out.println("Bu eli PC kazandi");
                            pcToplam++;

                        } else {
                            System.out.println("Bu eli sen aldın");
                            kullanıcıToplam++;
                        }
                        break;

                    case 2:
                        if (pc == 1) {
                            System.out.println("bu eli sen aldın");
                            kullanıcıToplam++;

                        } else if (pc == 2) {
                            System.out.println("berabere kaldınız tekrar sayı gırınız");

                        } else {
                            System.out.println("Bu eli pc kazandı");
                            pcToplam++;
                        }
                        break;

                    case 3:
                        if (pc == 1) {
                            System.out.println("bu eli pc aldın");
                            pcToplam++;

                        } else if (pc == 2) {
                            System.out.println("bu eli sen aldın");
                            kullanıcıToplam++;

                        } else {
                            System.out.println("berabere kaldınız tekrar sayı gırınız");
                        }
                        break;

                    default:
                        System.out.println("yanlıs sayı gırdın tekrar dene");
                        break;
                }
            }
            System.out.println();//dumy
            System.out.println("---------Oyun Sonu-----------");
            System.out.println(kullanıcıToplam == 3 ? "Siz kazandınız, tebrikler!" : "Pc Kazandiiiiiii");
        }

        private static int kullaniciGirisi() {
            System.out.println();//dumy
            System.out.println("Tas icin=> 1\nKait icin=> 2\nMakas icin=> 3");

            return input.nextInt();
        }

        private static int rastgeleSayı() {
            return rnd.nextInt(3) + 1;
        }

    }

