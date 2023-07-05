package ch15_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
 /*
array ve varargs method:
 */
//task1 verilen bir array deki elemanlari toplayan method create ediniz

        int[] arr = {1, 2, -3, 4, -5, -6};
arrtopla(arr) ;
vararagstopla(arr) ;
//vararagstopla(...22,55,66,77,98) ;
     //   System.out.println("vararagstopla(22,55,66,77,98) " + vararagstopla(22,55,66,77,98));

    }//main menü

    private static void vararagstopla(int... var) {
        int toplam=0;
        for (int w:var) {
            toplam+=w;


        }
        System.out.println("toplam = " + toplam);


    }

    private static void arrtopla(int[] arr) {
        int toplam=0;
        for (int w:arr) {
            toplam+=w;


        }
        System.out.println("toplam = " + toplam);
    }
}
