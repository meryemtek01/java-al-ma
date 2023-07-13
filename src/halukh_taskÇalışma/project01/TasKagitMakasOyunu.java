package halukh_taskÇalışma.project01;

import java.util.Scanner;

public class TasKagitMakasOyunu {
    public static void main(String[] args) {
        /*
Taş kağıt makas oyunu....
Bilgisayardan rastle(random class kullanılarak) 1-2-3 1=TAŞ, 2=KAĞIT, 3=MAKAS arasında bir sayı alıp kullanıcının
seçimini  kullanarak 3 puan alanın kazan oldugu code create ediniz .
*/
        Scanner input = new Scanner(System.in);
        int kul_puan = 0;
        int bil_puan = 0;
        System.out.println("Taş kağıt makas oyununa hoş geldiniz!");
        System.out.println("1-Taş 2-Kağıt 3-Makas");
        while (true) {
            System.out.println("Seçiminiz: ");
            int secim = input.nextInt();
            int bil_secim = (int) (Math.random() * 3);
            if (secim == 1) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: TaşnSonuç: Berabere");
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Kaybettiniz");
                    bil_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else {
                    System.out.println("Bilgisayarın seçimi: MakasnSonuç: Kazandınız");
                    kul_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                }
            } else if (secim == 2) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: TaşnSonuç: Kazandınız");
                    kul_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Berabere");
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else {
                    System.out.println("Bilgisayarın seçimi: MakasnSonuç: Kaybettiniz");
                    bil_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                }
            } else if (secim == 3) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: TaşnSonuç: Kaybettiniz");
                    bil_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Kazandınız");
                    kul_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else {
                    System.out.println("Bilgisayarın seçimi: MakasnSonuç: Berabere");
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                }
            } else {
                System.out.println("Hatalı giriş yaptınız tekrar deneyin");
                continue;
            }
            if (kul_puan == 3) {
                System.out.println("Oyunu " + kul_puan + "-" + bil_puan + " kazandınız");
                break;
            } else if (bil_puan == 3) {
                System.out.println("Oyunu " + bil_puan + "-" + kul_puan + " kaybettiniz");
                break;
            }
        }
    }
}
