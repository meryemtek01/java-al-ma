package halukh_taskÇalışma.tasks07;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        String passWord="Adaskas";
        char ilkKarekter = passWord.charAt(0);
        char sonKarekter = passWord.charAt(passWord.length()-1);
        int uzunluk=passWord.length();
        if (Character.isDigit(sonKarekter) && uzunluk>=6 && ilkKarekter==Character.toUpperCase(ilkKarekter))
            System.out.println("Password is valid");
        else System.out.println("Password is invalid");


    }
}
