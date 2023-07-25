package ch26_exception;

public class C04_NullPointerException {
    public static void main(String[] args) {


        String str = " ";
        System.out.println("str.length() = " + str.length());

        String str1 = null;
       //RTE System.out.println("str1.length() = " + str1.length());
//Exception in thread "main" java.lang.NullPointerException

        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu mesafi okursan null in lenght i ni aldın demektir");
        } catch (NullPointerException e) {
            System.out.println("null ın length i olur mu");
        }

        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu mesafi okursan \"\" in lenght i ni aldın demektir");
        } catch (Exception e) {

            throw new RuntimeException(e);
        }



    }
}
