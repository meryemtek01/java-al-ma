package halukh_taskÇalışma.InterviewQuestions.ObebOkek;

//import static InterviewQuestions.ObebOkek.Hesapla.obeb;
//import static InterviewQuestions.ObebOkek.Hesapla.okek;
import static halukh_taskÇalışma.InterviewQuestions.ObebOkek.Hesapla1.obeb;
import static halukh_taskÇalışma.InterviewQuestions.ObebOkek.Hesapla1.okek;


public class Runner1 {
    public static void main(String[] args) {
        ObebOkek obj1=new ObebOkek(15,18);
        System.out.println("obeb(obj1) = " + obeb(obj1));//1
        System.out.println("okek(obj1) = " + okek(obj1));//15
    }


}
