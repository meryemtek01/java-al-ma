package ch19_StringBuilder_method;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //1. boş sb objesi oluşturup append ile eklemek
        StringBuilder sb1 = new StringBuilder();//default capacity 16 olan volue olmayan boş sb
        System.out.println("sb1.length() = " + sb1.length());//sb1.length() = 0
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 16
        //twice the old capacity plus 2

        sb1.append("javaaslan");//bos olan sb objesine javaAslan eklendi
        System.out.println("sb1 = " + sb1);//sb1 = javaaslan
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 16

        sb1.append(" selam ").append(" nasılsın ").append(" maaşlara zam işi noldu ").append(63).append(" ").append(true);
        System.out.println("sb1 = " + sb1);//sb1 = javaaslanselamnasılsınmaaşlara zam işi noldu63true
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 70
//2. yol
      StringBuilder sb2= new StringBuilder("tommy lee janes");
        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 15
        System.out.println("sb2.capacity() = " + sb2.capacity());//sb2.capacity() = 31

        //trimtosize () lenght e dokunmaz capacity den fazlalıkları alır.
        System.out.println("trimtosize");
        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 15
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());//sb2.capacity() = 15 siz ne yaparsanız yapın size 15 bylık yer ayırıyor
        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 15

        StringBuilder sb3=new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());//sb3.length() = 0
        System.out.println("sb3.capacity() = " + sb3.capacity());//sb3.capacity() = 11
        sb3.append("rümeysa hanım QA");//11*2+2
        System.out.println("sb3.capacity() = " + sb3.capacity());//sb3.capacity() = 24

        //girilen indexdeki karakteri getirmek için

        System.out.println("sb3.charAt(4) = " + sb3.charAt(4));

        //istenen index aaralıkları getirmek için subsequence
        System.out.println("sb1.subSequence(3,10) = " + sb1.subSequence(3, 10));//sb1.subSequence(3,10) = aaslan
        System.out.println("sb1.substring(3,10) = " + sb1.substring(3, 10));//sb1.substring(3,10) = aaslan

//girilen iki int arasını siler delet()
        System.out.println("sb1.delete(3,10) = " + sb1.delete(3, 10));

        //girilen int index teki karakteri silen leteChart

        System.out.println("sb1.deleteCharAt(6) = " + sb1.deleteCharAt(6));
        //sb1.deleteCharAt(6) = javselm  nasılsın  maaşlara zam işi noldu 63 true

        //istenen indexe istenen ifadeyi ekler
        System.out.println("sb3 = " + sb3);//sb3 = rümeysa hanım QA
        System.out.println("sb3.insert(4,\";)\") = " + sb3.insert(7, ";)"));
        //sb3.insert(4,";)") = rümeysa;) hanım QA

        //belirli bir stringbuilder in istenen index sine verilen string in istenen  index aralığına ekleme
        System.out.println("sb3.insert(0,\"hi\",3,5) = " + sb3.insert(15, "hello", 1, 3));
        //sb3.insert(0,"hi",3,5) = elrümeysa;) hanım QA         sb3.insert(15,"hi",3,5) = rümeysa;) hanımel QA
   //belirli indexteki karakteri değiştirme
        sb3.setCharAt(5, 'S');
        System.out.println("sb3 = " + sb3);//sb3 = rümeySa;) hanımel QA

        //istenen aralıktaki degerleri siler ve yerine istenen string i ekler

        System.out.println("sb3.replace(7,9,\"meşgul\") = " + sb3.replace(7, 9, "meşgul"));
        //sb3.replace(7,9,"meşgul") = rümeySameşgul hanımel QA



    }
}
