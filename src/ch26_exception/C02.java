package ch26_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\akara\\IdeaProjects\\JavaTutorialTRyy\\src\\ch26_exception\\javadanEsintiler  ";

        FileInputStream fis = new FileInputStream(filePath);
        /*  Eğer bir method'da Checked (CTE riski olan excp.) exception varsa method
            signature(mnethod name'den sonraki bölüm) hata uyarısı altı kırmızı çizgi verir
            komutun derlenmesine izin vermez ve kod üzerine gelidiğimde Add...  exception handle etme
             tavsiye
                  eder otomatik throws excp eklenir.
                     Bu şekilde methodu call eden komutlar try-catch alinmasi garanti edilmiş olur.
                     */

        int  c;
        while( (c=fis.read()) !=-1){ //bu kod input olarak verilen dosyada son karaktere gelene kadar çalış demek oluyor
            System.out.print((char)c);



        }
        System.out.println();
        System.out.print("fis = " + fis);
    }
}