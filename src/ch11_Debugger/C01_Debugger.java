package ch11_Debugger;

public class C01_Debugger {
    /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir...


İki durumda debugger gerekli olabilir:
*  Mevcut kod devralındığında.
*  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
*/
    public static void main(String[] args) {
        String str = "bunu ilerde kullanın hocam  korku iyidir diri tutarr ";
        System.out.println("str.substring(10) = " + str.substring(10));

        System.out.println("str.substring(str.length()-6) = " + str.substring(str.length() - 6));
    }
}
