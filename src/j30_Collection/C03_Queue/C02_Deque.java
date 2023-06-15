package j30_Collection.C03_Queue;


    import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

    public class C02_Deque {
        public static void main(String[] args) {
            /*
        Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
       LİFO : Last in First out

         */
            Deque<String> dq1 = new LinkedList<>(Arrays.asList("javaCAN", "javaSU", "javvaNUR", "javaNAZ", "javaTAR"));
            // deque print->
            System.out.println("dq1 = " + dq1); // [javaCAN, javaSU, javvaNUR, javaNAZ, javaTAR]

            dq1.add("selam");
            System.out.println("dq1 add sonrası : " + dq1); //  [javaCAN, javaSU, javvaNUR, javaNAZ, javaTAR, selam]
            System.out.println("dq1.getFirst() = " + dq1.getFirst());// [javaCAN, javaSU, javvaNUR, javaNAZ, javaTAR, selam]
            System.out.println("dq1 getFirst() sonrası : " + dq1); // javaCAN
            System.out.println("dq1.getLast() = " + dq1.getLast()); // selam
            System.out.println("dq1 getLast() sonrası : " + dq1); // [javaCAN, javaSU, javvaNUR, javaNAZ, javaTAR, selam]

            System.out.println("dq1.peek() = " + dq1.peekFirst());//javaCAN
            System.out.println("dq1.peekLast() = " + dq1.peekLast());//selam
            dq1.clear();
            System.out.println("dq1.peek() = " + dq1.peekFirst());//null
            System.out.println("dq1.peekLast() = " + dq1.peekLast());//null
            //  System.out.println("dq1.getFirst() = " + dq1.getFirst());// rte->NoSuchElementException
            // System.out.println("dq1.getLast() = " + dq1.getLast());// rte->NoSuchElementException


            Deque<String> dq2 = new LinkedList<>(Arrays.asList("javaCAN", "javaSU", "javvaNUR", "javaNAZ", "javaTAR"));
            System.out.println("dq2.pollFirst() = " + dq2.pollFirst());  //  javaCAN
            System.out.println("dq2.pollFirst() = " + dq2.pollFirst());  //  javaCAN
            System.out.println("dq2.pollLast() = " + dq2.pollLast());  // javaTAR
            System.out.println("dq2.removeFirst() = " + dq2.removeFirst()); // javaSU
            System.out.println("dq2.removeLast() = " + dq2.removeLast()); // javaNAZ

            dq2.clear();
            System.out.println("dq2.pollFirst() = " + dq2.pollFirst());  //  null
            System.out.println("dq2.pollLast() = " + dq2.pollLast());  // null
            System.out.println("dq2.removeFirst() = " + dq2.removeFirst()); // rte-> NoSuchElementException
            System.out.println("dq2.removeLast() = " + dq2.removeLast()); //  rte-> NoSuchElementException

            System.out.println("agam code cincix dewamkeee  :) ");
        }
}
