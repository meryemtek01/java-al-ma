package ch10_MethodCreation;

import java.util.Scanner;

public class C06_RecursiveMethod {
    public static void main(String[] args) {

        /*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek
 konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */

        //Task kullanicidan aldiginiz sayinin foktoriel ini hesaplayan method create edini
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz ");
        int sayi= input.nextInt();
        System.out.println("factorial(sayi) = " + factorial(sayi));


    }

    private static int factorial(int sayi) {
        if (sayi>=1){
            return sayi*factorial(sayi-1);
        }else return 1;//sıfırın factorıal i 1 oldugu için
    }
/*loop ile cözumu
int baslangic=1;
for (int i=1; i<=sayi; i++){
    baslangic+=i;

    }
    */


}
