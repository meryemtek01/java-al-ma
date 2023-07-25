package ch26_exception;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        int [] arr={22,55,35,34,33,63,21,72};

        System.out.println("arr[0] = " + arr[0]);
      // RTE  System.out.println("arr[8] = " + arr[8]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException


    }
}
