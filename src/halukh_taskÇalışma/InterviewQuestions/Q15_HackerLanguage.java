package halukh_taskÇalışma.InterviewQuestions;


import java.util.Scanner;


import static java.util.Collections.replaceAll;

public class Q15_HackerLanguage {

// Task->Girilen bir metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) create ediniz.
//replace ile olabilir
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Agam bi şeyler giresen : ");
        String  str=input.nextLine();
        hackerDili(str);
        hackerDili("javaCan javvaNur javaSu javaTar javaNaz javaHan");


      //  hackerDili(str);
      //  hackerDili("javacan javvaNur javasu javanaz javahan");
    }//main sonu
    private static void hackerDili(String str) {

        System.out.println(str.
                replaceAll("s", "5").
                replaceAll("a", "4").
                replaceAll("e", "3").
                replaceAll("i", "1").
                replaceAll("o", "0"));

    }


}//class sonu