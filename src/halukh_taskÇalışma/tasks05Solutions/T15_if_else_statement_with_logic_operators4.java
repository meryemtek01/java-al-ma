package halukh_taskÇalışma.tasks05Solutions;

public class T15_if_else_statement_with_logic_operators4 {

    public static void main(String[] args) {

        /*   String number oluşturulmuştur.
             Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
             Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
             Aksi halde (else) "no money" yazdırın.   */
        String str = "100";
        if (str.contains("$")) System.out.println("This is dollar");
        else if (str.contains("£")) System.out.println("This is Paund");
        else System.out.println("not money");



    }
}
