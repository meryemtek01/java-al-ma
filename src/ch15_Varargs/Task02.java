package ch15_Varargs;

public class Task02 {
    public static void main(String[] args) {

        /*
Task ->
array deki ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
 */

        int []arr = {2,55,66,88,5,2,4,5,6,3,8,55,33,34,35};
       toplamcarp(arr);

       // System.out.println(" toplamcarp(arr)"+ toplamcarp(arr));

    }//main sonu

    private static void toplamcarp(int...var) {
        int toplam=0;
        for (int i =2 ;i <var.length ; i++) {
            toplam+=var[i];//ilk sayı hariç tüm sayıları topladık

        }
        toplam*=var[0];//
        System.out.println("toplam = " + toplam);
    }


}
