package halukh_taskÇalışma.tasks06_SwitchCase.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo =");
        int gunNo = oku.nextInt();

//        if (gunNo==1)
//            System.out.println("Pazartesi");
//        else
//            if (gunNo=2)
//                System.out.println("Salı");
//            ....

        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5: // gunNo 5 eşit ise
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı gün no");
        }
    }
}
