package halukh_taskÇalışma.Challange08;

public class Task04 {
    public static void main(String[] args) {
        /*task->
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * print eden   method create ediniz.
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

      ;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length ; j++) {

                if (istenenToplam== arr[i]+arr[j]){
                    System.out.println(arr[i] + " ve " +arr[j]+" = "+istenenToplam);
                }

            }

        }




        }
    }

