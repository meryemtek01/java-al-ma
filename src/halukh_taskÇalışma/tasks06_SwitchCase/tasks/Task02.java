package halukh_taskÇalışma.tasks06_SwitchCase.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğununuzu giriniz : ");
        int kacıncıGun = scan.nextInt();


        if (kacıncıGun <= 0 || kacıncıGun > 7) {
            System.out.println("hatalı veri girdiniz");
        } else {


            System.out.print("kac gun sonrasını öğrenmek istiyorsunuz : ");
            int kacGunSonrasi = scan.nextInt();
            int bulunanGun = (kacGunSonrasi + kacıncıGun) % 7;
            switch (bulunanGun) {

                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden SALI");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZAR");
                    break;
                default:
                    System.out.println("agam niddin!!!  hafta 7 gun :-( ");
            }
        }

    }
}

