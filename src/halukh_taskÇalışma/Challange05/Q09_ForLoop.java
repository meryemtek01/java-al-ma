package halukh_taskÇalışma.Challange05;

public class Q09_ForLoop {
    //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers
//120'den 11'e kadar 4'e bölünebilen ve 6'ya bölünebilen tüm tam sayıları aynı satıra ardışık tamsayılar arasında boşluk bırakarak yazın
    public static void main(String[] args) {
       int count=0;
       int toplam=0;
        for (int i = 11; i <=120 ; i++) {
            if (i%2==0){
             count++;
             toplam+=i;
            }
        }
        System.out.println(" onikiy e bolunen sayi "+count);
        System.out.println(" toplam"+toplam);

    }
}
