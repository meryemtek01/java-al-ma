package halukh_taskÇalışma.tasks07;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(harfDepo.substring(5,6)
                +harfDepo.substring(0,1)
                +harfDepo.substring(17,18)
                +harfDepo.substring(20,21)
                +harfDepo.substring(10,11));
        System.out.print(harfDepo.charAt(5));
        System.out.print(harfDepo.charAt(0));
        System.out.print(harfDepo.charAt(17));
        System.out.print(harfDepo.charAt(20));
        System.out.print(harfDepo.charAt(10));


    }
}
