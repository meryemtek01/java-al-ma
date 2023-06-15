package halukh_taskÇalışma.Challange02;

import java.util.Scanner;

public class Task04_IfStatement {

    /* Task ->
     * Girilen Y/N  degerlerini
     * print eden code create ediniz..
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aslanım  hele bir Y ya da N gir baken : ");
        System.out.println("   ***  char çözüm ***   ");
        char aslanKarakter = input.next().charAt(0);
        if (aslanKarakter == 'Y' || aslanKarakter == 'y') //girilen karakterin Y veya y olma şartı kontrol edilir
            System.out.println("YES");
            // System.out.println("ahan da if blok dışıyım ");
        else if (aslanKarakter == 'N' || aslanKarakter == 'n') {
            System.out.println("NO");
        } else
            System.out.println("Aslanım hatalı giriş yaptın... neyse ki fenerli değilsin  ");
        System.out.println("ASLANIMA BOLCANA SELAM :-)");//else komut scop dışı else olsa da olmasa da run olur.}

        System.out.println("   ***   String çözüm   ***   ");
        String kelime = input.next();

        if (kelime.equalsIgnoreCase("y")) {
            System.out.println("YES");
        } else if (kelime.equalsIgnoreCase("n")) {
            System.out.println("NO");
        } else System.out.println("Aslanım adam gibi bi şey giresen  :( ");
    }// main sonu

}
