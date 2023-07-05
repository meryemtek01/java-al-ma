package halukh_taskÇalışma.InterviewQuestions;


import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayı olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int sayi = sc.nextInt();

        boolean flag = true; //asaldir

        if(sayi>=2){
            for (int i = 2; i <sayi ; i++) {
                if(sayi%i == 0){ //herhangi bir boleni varsa
                    flag=false;
                    break;
                }
            }
           if(flag) System.out.println(sayi + " sayisi asaldir");
           else System.out.println(sayi + " sayisi asal degildir");

        }else System.out.println(sayi + " sayisi asal degildir"); //0,1, negatif sayiari bertaraf etmek icin


        /* Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int sayi = input.nextInt();
        boolean asalMı = true;
        if (sayi >= 2) {//girilen sayının 2 den buyuk olma kontrolu
            for (int i = 2; i < sayi; i++) {//2 den girilen sayıdan 1 kucuk olan sayuya kadar tekrar
                if (sayi % i == 0) {//sayının kendisinden önceki herhangi bir sayıya tam bolunme kontrolu
                    asalMı = false;
                    break;
                }
            }
            if (asalMı) {
                System.out.println("girilen sayı asal ");
            } else System.out.println("girilen sayı asal değildir");
​
        } else {
            System.out.println("girilen sayı asal değildir");*/
    }

}
