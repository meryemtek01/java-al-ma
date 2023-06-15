package halukh_taskÇalışma.tasks07;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.
        String str1 = "lmanyadddfj";
        String str2 = str1.toLowerCase();
        int sira = str2.indexOf("a");
        str2 = str2.substring(sira+1);
        int ikinciSira = str2.indexOf("a");
        if (ikinciSira == -1) System.out.println("2.a yoktur");
        else System.out.println("Ikıncı a nın idexi = "+ (ikinciSira+1+sira) );




    }
}
