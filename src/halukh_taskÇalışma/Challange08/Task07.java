package halukh_taskÇalışma.Challange08;

public class Task07 {
    public static void main(String[] args) {
        /* task->
         * verilen  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini için
         *  2D arrayinden min number print den code create ediniz.
         */

        int arr[][] = {{1, 2, 3}, {2, 3, 1}, {-5, 5, 5}, {2, -1}};
        int min = arr[0][0]; //arr2nin ilk elemanı min sayı olarak atandı
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<min){//döngüdeki herbir arr elemanı min2den küçük olma şartı
                    min = arr[i][j];//döngüde min den küçük olan arr elemanı yeni min olarak atandı
                }


            }

        }
        System.out.println("min = " + min);


    }


}
