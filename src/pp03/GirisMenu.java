package pp03;

import java.util.ArrayList;
import java.util.Scanner;

import static pp03.Kayıt.*;

public class GirisMenu {

public static void giris(){
   // ArrayList<Kullanıcı> kllnclist = new ArrayList<Kullanıcı>();

    System.out.println("Lütfen işleminizi seçiniz:\n1-> Kullanıcı kayıt :\n" +
            "2->Şanslı kişi Bul\n3->Kayıtları Listele\n0 ->Çıkış");
    //Scanner input=new Scanner(System.in);
    System.out.println("seçiminizi giriniz:");
    //int secim=input.nextInt();
    switch (new Scanner(System.in).nextInt()) {
        case 0:
            cıkıs();
            break;
            case 1:

                kullanıcılar=kayıtAl();//kayıt al class dan call edildl
               giris();
                break;
                case 2:
                    sanslıKullanıcıBul(kullanıcılar);
                    giris();
                    break;
                    case 3:
                       listele(kullanıcılar);
                        giris();
                        break;
        default:
            System.out.println("hatalı giriş  tekrar giriş yapınız: ");
            break;



    }

}
    public static void cıkıs() {
        System.out.println("cıkısınız yapılmıştır");
    }

}
