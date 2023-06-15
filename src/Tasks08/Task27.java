package Tasks08;

public class Task27 {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */


        for (int i=1; i<5; i++){ // ayda 4 hafta oldugundan i<5 dedik. Baslangic hafta numarasi week 1==>i=1
            System.out.println("IT : " + i);

            for (int k=1; k<8; k++){
                System.out.println("QA: " +k);
            }// Nested Loop, ustteki disardaki loop, alttaki icerdeki loop

        }

    }
}
