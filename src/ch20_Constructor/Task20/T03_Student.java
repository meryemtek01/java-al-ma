package ch20_Constructor.Task20;

import java.util.ArrayList;
import java.util.Scanner;

public class T03_Student {

    /*fields : name, maxCredit, dersleri(T03_Lesson class obj) saklayacak list
       derslerin toplam kredi miktarını return eden  toplamKredisi method */
    public static ArrayList<T03_Lesson> dersList = new ArrayList<T03_Lesson>();
    public static ArrayList<String> dersNames = new ArrayList<String>();
    public static ArrayList<Integer> dersCredits = new ArrayList<Integer>();
    public static ArrayList<T03_Lesson> secilenDersler = new ArrayList<T03_Lesson>();
    static Scanner input = new Scanner(System.in);
    String studentName;
    int maxCredit = 10;

    public T03_Student() {
    }
    public static ArrayList<T03_Lesson> dersEkle(){

        return dersList;
    }
    public T03_Student(String studentName) {
        this.studentName = studentName;

    }


    public int toplamKredisi(){
        int toplam = 0;
        for (T03_Lesson each : dersList) {
            toplam +=  each.credit;
        }

        return toplam;
    }
    public void ogrenciTercih(){
        int sum = 0;
        int x = 1;
        int dcredit ;
        do {
            System.out.println("ders seciniz");
            for (T03_Lesson each : dersList) {
                System.out.println(x + ". - " + each.name + " " + each.credit);
                x++;
                if (x == 4)
                    x = 1;
                dersNames.add(each.name);
                dersCredits.add(each.credit);
            }
            int secim = input.nextInt();

            switch (secim) {
                case 1:
                    sum += dersCredits.get(secim - 1);
                    if (sum < maxCredit)
                        secilenDersler.add(dersList.get(secim-1));
                    break;
                case 2:
                    sum += dersCredits.get(secim - 1);
                    if (sum < maxCredit)
                        secilenDersler.add(dersList.get(secim-1));
                    break;
                case 3:
                    sum += dersCredits.get(secim - 1);
                    if (sum < maxCredit)
                        secilenDersler.add(dersList.get(secim-1));
                    break;
                default:
                    break;

            }
        }while (sum <= maxCredit);
        System.out.println("secilen dersler");
        for (T03_Lesson each:secilenDersler) {
            System.out.println(each.name +" " + each.credit);

        }

    }

    @Override
    public String toString() {
        return "student Name='" + studentName ;
    }

}

