package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q08_ArmstrongNumbersoru2 {
    public static void main(String[] args) {
       /* soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
        gösteren program yazınız */
        Scanner input = new Scanner(System.in);

        System.out.println("bizim oglan birşeyler girecek mi: ");


        String sayi = input.nextLine();//1634


        System.out.println("anstrongControl(sayi) = " + anstrongControl(sayi));

        girilensayıkadarAmstrongControl(sayi);




    }//mainsonu
    private static void girilensayıkadarAmstrongControl(String sayi) {
        for (int i = 0; i <Integer.parseInt(sayi) ; i++) {
            anstrongControl(String.valueOf(i));

        }

    }

    private static String anstrongControl(String sayi) {
        int rakamKupToplam = 0;
        String[] rakam = sayi.split("");
        //  System.out.println("Arrays.toString(rakam) = " + Arrays.toString(rakam));

        for (int i = 0; i < rakam.length; i++) {
            rakamKupToplam+= Math.pow(Double.parseDouble(rakam[i]), rakam.length);


        }
        return   rakamKupToplam==Integer.parseInt(sayi)?
                "bizimoglan sayi  "+sayi+"   AMSTRONG:)":
                "bizimoglan sayi  "+sayi+"   AMSTRONG feğil :(";



    }


}//clas sonu
