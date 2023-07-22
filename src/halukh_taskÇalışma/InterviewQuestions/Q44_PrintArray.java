package halukh_taskÇalışma.InterviewQuestions;

public class Q44_PrintArray {
    //Task->
    // Create a method which takes String array as a parameter
    // and prints all the element


        public static void main(String[] args) {
            String  arr[]={"sefil haluk","serap Lead","aytekin master","boos mustafa"};
            printArr(arr);
        }

        private static void printArr(String[] arr) {
            for (String s:arr  ) {
                System.out.print(s+" ");
            }
        }



}
