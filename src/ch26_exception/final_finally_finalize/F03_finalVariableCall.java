package ch26_exception.final_finally_finalize;

public class F03_finalVariableCall {
    public static void main(String[] args) {

        System.out.println("F03_finalVariable.sayi = " + F03_finalVariable.sayi);
       // F03_finalVariable.sayi++;
//Cannot assign a value to final variable 'sayi'
        /**
         * final variable degeri başlangiçta initialize edilir
         * sonrası degiştirilemez
         */


    }


}
