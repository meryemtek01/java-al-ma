package farukH_TaskCalısma.task08doWhile;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */
        int input= 144;
        int karekok=1;
        boolean sonuc= false;
        while (karekok*karekok <= input){

            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }
        }
        System.out.println(sonuc);

        // do while loop ile yapalim
        karekok=1;
        sonuc=false;
        do {
            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }

        }while(karekok*karekok<=input);
        System.out.println(sonuc);

        // cozum 3
        karekok = (int) Math.sqrt(input);
        if (karekok*karekok==input) {
            System.out.println("Girilen sayinin karekoku : " + karekok);
            System.out.println(true);
        } else System.out.println(false);
    }
}
