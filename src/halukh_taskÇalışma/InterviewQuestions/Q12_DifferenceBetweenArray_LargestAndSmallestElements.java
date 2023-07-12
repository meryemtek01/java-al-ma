package halukh_taskÇalışma.InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
 */
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Agam array boyutunu  giresen  : ");
            int arrBoyut = input.nextInt();
            int arr[] = new int[arrBoyut];
            for (int i = 0; i < arrBoyut; i++) {
                System.out.println("Agam array'in "+ (i+1)+" elemanını giresen : ");
                arr[i]=input.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);//arr elemanları NO sıralandı : k-> b
            System.out.println(Arrays.toString(arr));

            System.out.println(arr[arrBoyut - 1] - arr[0]);

    }
}