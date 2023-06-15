package halukh_taskÇalışma.tasks07;

public class Task14 {
    public static void main(String[] args) {
         /* Harflerden oluşan bir stringin içindeki tüm "a" leri, "e" ve
        tüm "e" leri "a" yapınız
         */
        String str = "aaeedjasdf".toLowerCase();
        System.out.println(str);
        str  = str.replace("a","*");
        str  = str.replace("e","a");
        str  = str.replace("*","e");
        System.out.println(str);


    }
}
