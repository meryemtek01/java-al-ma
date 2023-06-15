package Tasks08;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();//"aabbcccccddddaaa"
        String output = "";//işleme etki etmeyecek boş kutu tanımlandı

        for (int i = 0; i <= str.length() - 1; i++) {

            if (!output.contains(str.substring(i, i + 1))) {//strden ardışık parça cıktıda yoksa şartı

                //cıktı += str.substring(i, i + 1);//kutudan olmayan eleman kutuya eklendi
                output += str.charAt(i);//kutudan olmayan eleman kutuya eklendi
            }
        }

        System.out.println("cıktı = " + output);
    }
}
