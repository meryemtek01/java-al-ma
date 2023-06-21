package halukh_taskÇalışma.Challange07;

import java.util.Scanner;

public class Task01 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Agam bişeyler cizikdiresen : ");
        String str = input.nextLine();
        if (str.length()>=3 ) {
            //System.out.println(xyzVarMi1(str));// p'li meth call...
            // System.out.println(xyzVarMi2(str));// p'li meth call...
            //  System.out.println(xyzVarMi3(str));// p'li meth call...
            xyzVarMi4(str);// p'li meth call...
        }else System.out.println("agam girdigin input kontrol için yetersiz");

    }

    private static boolean xyzVarMi1(String str) {
        return str.contains("xyz")?true:false;
    }

    private static boolean xyzVarMi2(String str) {
        if (str.contains("xyz")){
            return true;
        }else return false;
    }
    private static String xyzVarMi3(String str) {
        return str.contains("xyz")?"Agam girdigin xyz içeririr bizimlezın ":"xyz içermez bizimle değılsın ";
    }

    private static void xyzVarMi4(String str) {
        System.out.println(str.contains("xyz") ? "Agam girdigin xyz içeririr bizimlezın " : "xyz içermez bizimle değılsın ");
    }






}
