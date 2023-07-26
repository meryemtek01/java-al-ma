package halukh_taskÇalışma.InterviewQuestions.ObebOkek;

public class Hesapla1 {
    public static int obeb(ObebOkek eleman) {

        int ks = Math.min(eleman.getS1(), eleman.getS2());
        int obeb = 1;
        for (int i = ks; i > 1; i--) {
            if (eleman.getS1() % i == 0 && eleman.getS2() % i == 0) {
                obeb = i;
                break;
            }
        }
        return obeb;
    }

    public static int okek(ObebOkek eleman) {//eleman s1=12,s2=18
        int bs=Math.max(eleman.getS1(),eleman.getS2());//18
        int okek=eleman.getS1()*eleman.getS2();

        for (int i = bs; i <eleman.getS1()*eleman.getS2() ; i++) {//18 ,19,20...12*18
            if (i%eleman.getS1()==0&&i%eleman.getS2()==0) {//tekrardaki her bir elelman s1 ve s2 ye tam bolunme sartı-> s2 ve s2'nin ortak katı
                okek=i;
                break;
            }
        }
        return okek;
    }
}
