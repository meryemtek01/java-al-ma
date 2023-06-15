package Tasks08;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK


        String input= "Java candir, Selenium heyecandir";





        for (int i = 0; i <input.length() ; i++) {

            System.out.print  ( i%2==0 ? input.substring(i,i+1).toUpperCase() // index cift ise
                                         : input.substring(i,i+1).toLowerCase()); // index cift degilse

        }
    }
}
