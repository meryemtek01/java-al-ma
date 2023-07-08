package halukh_taskÇalışma.project02;

import java.util.Arrays;
import java.util.List;

public class Task06_ElementUpdateList {
/* Task->
     If the list has 12 as element, change all 12s to 21
     Listteki 12 elemanını 21 olarak update eden code create ediniz
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

    public static void main(String[] args) {

    List<Integer> list = Arrays.asList(12, 11, 12, 15, 12, 34, 43);
   // List<Integer> list = Arrays.asList(13, 11, 13, 15, 13, 34, 43);


    System.out.println(list);
if (list.contains(12)) {
    for (int avuc : list) {
        if (avuc == 12) {
          //  list.set(avuc,21);
           list.set(list.indexOf(12), 21);


        }
    }
}
        System.out.println("list = " + list);


    }//main sonu



}//class sonu
