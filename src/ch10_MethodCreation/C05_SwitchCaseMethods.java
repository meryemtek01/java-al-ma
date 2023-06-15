package ch10_MethodCreation;

import java.util.Scanner;

public class C05_SwitchCaseMethods {///locomotif olacak yani diger C05 class ları
    //Task kullanıcı ismini alıp crud yapan farklı bir clas

    public static void menu() {
        System.out.println("sistemimize hoş geldiniz ");
        System.out.println("uygulamaya kayıt olmak için  1  \nKullanıcı sorgulamak için  2  \n" + "Kullanıcı bilgi güncelleme için 3  \nkullanıcı silme için 4 \nÇıkış işlemler için  5 e basınız");
        Scanner in = new Scanner(System.in);
        int secim = in.nextInt();

        switch (secim) {
            case 1:
                menu();
              C05_CRUD.createUser();
                break;
            case 2:

                C05_CRUD.getUser();
                menu();
                break;
            case 3:
                C05_CRUD.deletUser();
                menu();
                break;
            case 4:
                C05_CRUD.deletUser();
                menu();
                break;
            case 5:
                C05_CRUD.cıkıs();
                break;


        }

    }
}
