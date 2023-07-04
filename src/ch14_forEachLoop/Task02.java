package ch14_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        /* TASK :
bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
input : 1,2,-3,4,-5,-6
output :-1,-2,3,-4,5,6


 */
        int[] arr= {1,2,3,4,5,6};
        sayininTersisareti(arr);
        isaretDeğiş(arr);
    }//main sonu

    private static void isaretDeğiş(int[] arry) {
        List<Integer> list=new ArrayList<Integer>();
        for (int each:arry) {
            each*=-1;
            list.add(each);

        }
        System.out.println("list = " + list);

    }

    private static void sayininTersisareti(int[] arry) {
        for (int w:arry) {


        }
    }
}
