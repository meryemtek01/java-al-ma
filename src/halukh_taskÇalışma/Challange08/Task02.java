package halukh_taskÇalışma.Challange08;

public class Task02 {
    public static void main(String[] args) {
        /* task->
         * dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari print eden code create ediniz.
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        int arr [] = {1,2,3,4,5,6,7};
        int toplam = 0;
        int ortalama = 0;

        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];

        }
        System.out.println("toplam "+toplam);
        ortalama = toplam / arr.length;
        System.out.println("ortalama=toplam/arr.length = " +ortalama);
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>ortalama){
                System.out.print(arr[i]+ " ");
            }
        }


    }
}
