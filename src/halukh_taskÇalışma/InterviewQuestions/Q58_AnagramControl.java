package halukh_taskÇalışma.InterviewQuestions;
import java.util.Arrays;
import java.util.Scanner;
public class Q58_AnagramControl {

		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
        public static void main(String[] args) {
		/*
		    Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java method create ediniz
			isAnagram("listen", "Silent") ==> true
		 */

            Scanner input = new Scanner(System.in);
            System.out.print("1. String  ifadeyi  giriniz : ");//listen
            String str1 = input.nextLine().toLowerCase().replace(" ", "");
            System.out.print("2. String  ifadeyi  giriniz : ");//silent
            String str2 = input.nextLine().toLowerCase().replace(" ", "");
            //  System.out.println(isAnagram(str1, str2));
            System.out.println(isAnagram1(str1, str2));

        }//main sonu

        private static boolean isAnagram(String str1, String str2) {//listen silent
            char[] str1Arr = str1.toCharArray();
            char[] str2Arr = str2.toCharArray();
            Arrays.sort(str1Arr);// [e,i,l,n,t,s]
            Arrays.sort(str2Arr);// [e,i,l,n,t,s]

            if (str1Arr.length != str2Arr.length) {
                return false;
            }
            for (int i = 0; i < str1Arr.length; i++) {
                if (str1Arr[i] != str2Arr[i]) {
                    return false;
                }
            }

            return true;
        }
        private static boolean isAnagram1(String str1, String str2) {//listen silent


            if (str1.length() != str2.length()) {
                return false;

            }
            for (int i = 0; i < str1.length(); i++) {
                if (!str2.contains(str1.substring(i,i+1))) {
                    return false;
                }
            }

            return true;
        }
    }//Class sonu
    

