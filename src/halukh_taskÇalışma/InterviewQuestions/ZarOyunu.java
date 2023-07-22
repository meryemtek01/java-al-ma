package halukh_taskÇalışma.InterviewQuestions;

public class ZarOyunu {
    /* Task->
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" ,
     aksi takdirde "Tekrar deneyiniz" print eden code create ediniz

     */

    public static void main(String[] args) {
      int ilkAtıs=(int)( Math.random()*(6-1)+1)+1;//0 ile 6 arasında random double sayı return eder
      int ikiciAtıs=(int)( Math.random()*(6-1)+1)+1;//0 ile 1 arasında random double sayı return eder
        System.out.println("ilkAtıs = " + ilkAtıs);
        System.out.println("ikiciAtıs = " + ikiciAtıs);
        System.out.println("ilkAtıs+ikiciAtıs = " +(ilkAtıs + ikiciAtıs));
        System.out.println((ilkAtıs + ikiciAtıs )== 9 ? " Kazandınız" : "Tekrar deneyiniz");


    }





    }
