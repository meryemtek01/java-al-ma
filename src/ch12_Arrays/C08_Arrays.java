package ch12_Arrays;

public class C08_Arrays {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;


        bulToplamEsitCiftler(arr, istenenToplam);
    }

    private static void bulToplamEsitCiftler(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length - 1; i++) {//outer forloop
            for (int j = i + 1; j < arr.length; j++) {//inme for loop
                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + istenenToplam);
                }
            }
        }
    }

}
