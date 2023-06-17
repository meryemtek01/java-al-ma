package farukH_TaskCalısma.task08doWhile;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri prnt eden code create ediniz

        char baslangic='f';
        char bitis='m';

        do {
            System.out.print(baslangic + " ");
            baslangic= (char)(baslangic+1);

        }while(baslangic<=bitis);
    }
}
