package ch26_exception;

public class C06_NumberFormatException {

    public static void main(String[] args) {
// NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method runn ederek ınteger'e
// cevirildiğinde oluşan RTE exception
// java'da String içinde ki rakam karakterler parseInt() method ile ınt değere atanabilir

        String str="1516";
        System.out.println("(str+53) = " + (str + 53));//(str+53) = 151653

        int sayi=Integer.parseInt(str);
        System.out.println("(sayi+53) = " + (sayi + 53));//(sayi+53) = 1569

        String id="id12345";
      // RTE int sayi2=Integer.parseInt(id);
//Exception in thread "main" java.lang.NumberFormatException: For input string: "id12345"

        try {
            int sayi2=Integer.parseInt(str);
            System.out.println("bu mesaj hatasız kod mesajıdır");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException:for  ");
        }

        try {
            int sayi3=Integer.parseInt(str);
            System.out.println("bu mesaj hatasız kod mesajıdır");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException:for  ");
        }

    }
}
