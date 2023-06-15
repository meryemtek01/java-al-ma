package halukh_taskÇalışma.Challange03;

import java.util.Scanner;

public class Task04_SwitchCase {
    /*
   switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
   switch() de int, byte, short, char, String kullanilir.
    */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bizim ooolan final notunuzu harf değerini giriniz :");

        String gun = input.next().toLowerCase();

        switch (gun) {
            // default:
            //     System.out.println("off day : sahilde pijama atlet duman altı tavuk kanat ");
            //  break;
            case "pazartesi":
            case "salı":
                System.out.println("java class day");
                break;
            case "perşembe":
            case "cuma":
                System.out.println("Selenium class day");
                break;
            case "carşamba":
            case "cumartesi":
                System.out.println("SQL class day");

                break;
            default: // bu komut switch blok herhangibir yerinde olabilir..
                System.out.println("off day : sahilde pijama atlet duman altı tavuk kanat ");


        }// swicth sonu
        System.out.println("agıdeş code cincix dewamkeee :) "); // bu print run olursa code sorunsuz..
    }// main sonu
}
