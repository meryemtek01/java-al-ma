package halukh_taskÇalışma.tasks05Solutions;

public class T06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 ise "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */
        int number = 0;
        if (number>0) {
            System.out.println("I m positive");
        }
        else {
            if (number<0) System.out.println("I m negative");
            else {
                if (number==0) System.out.println("I m neutra");
            }
        }



    }
}
