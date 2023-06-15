package Tasks08;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını(harfin kaç adet olduğunu) print eden code create ediniz


        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("agam bir ifade giresen : ");
        String str = input.nextLine();//javacan

        System.out.print("agam hangi harfi saydıracaksın :");
        char harf=input.next().charAt(0);//a

        int harfSayisi=0;//işleme etki etmeyecek başlangıc değeri 0 olan bir int atandı

        for (int i = 0; i <=str.length()-1 ; i++) {//str ilk harf olan index 0 dan son harf olan length()-1 indexe kadar tekrar tanımlandı
            if (str.charAt(i)==harf) {//tekrardan gelen ifaden her bir harfini istenen harfe eşitliğini kontrol eder
                harfSayisi++;
            }
        }

        System.out.println("agam giridigin  ifade : "+str+" de istediğin harf :"+harf+", "+harfSayisi+" tane var");
       // cozum 2
//        harfSayisi = str.length() - str.replace( String.valueOf(harf),"").length();
//        harfSayisi = str.length() - str.replace( harf+"","").length();
//        System.out.println("agam giridigin  ifade : "+str+" de istediğin harf :"+harf+", "+harfSayisi+" tane var");

    }
}
