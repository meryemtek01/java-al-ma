package halukh_taskÇalışma.Challange02;

import java.util.Scanner;

public class Task05_IfStatement {
    /* Task->
    Girilen jobTitle data için : Eger jobTitle
    qa ise print "is unvaniniz Quality Analyst."
    dev ise print "is unvaniniz Developer."
    ba ise print "is unvaniniz Business Analyst."
    pm ise print "is unvaniniz Project Manager."
    code create ediniz...
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Aslanım  hele bir jobTitle gir baken : ");
        String jobTitle = input.next();


        if (jobTitle.equalsIgnoreCase("qa")) {//girilen jobTitle qa uncase sensitive  olma sartı kontrol edldi
            System.out.println("is unvaniniz Quality Analyst.");

        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("is unvaniniz Developer.");

        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("is unvaniniz Business Analyst.");

        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("is unvaniniz Project Manager.");

        } else System.out.println("aslanım adam gibi bi şey gir :( ");


    }// main sonu


}