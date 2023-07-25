package ch26_exception.Error_GarbageCollektor;

public class C03_GarbageCollektor {
    public void finalize() {
        System.out.println("objectis garbege collected");


    }

    public static void main(String[] args) {

        C03_GarbageCollektor s1=new C03_GarbageCollektor();
        C03_GarbageCollektor s2=new C03_GarbageCollektor();

        s1=null;
        s2=null;
        System.gc();

    }
    /*
  Note: The Garbage collector of JVM collects only those objects that are created by new keyword.
  So if you have created any object without new, you can use finalize method to perform cleanup processing
   (destroying remaining objects).
   */
}
