package halukh_taskÇalışma.InterviewQuestions;

public class Q35_WrapperClassTask {
 /* Task->
     create a method that accepts an int
     and returns twice of that int
     overload this method with wrapper class: Integer

     int parametreli ve parametrenin 2 katını return eden method create ediniz.
     Bu methodu Wrapper class ile overload ediniz.
      */

    public static void main(String[] args) {
        int sayi=145;

        System.out.println("tljmethod(sayi) = " + tljmethod(sayi));

        Integer yas=48;

        System.out.println("tljmethod(yas) = " + tljmethod(yas));


    }//main sonu

    private static int tljmethod(int sayi) {

        return  sayi*2;
    }
    private static int tljmethod(Integer sayi) {// Bu methodu Wrapper class ile overload ediniz.

        return  sayi*2;
    }

}//class sonu
