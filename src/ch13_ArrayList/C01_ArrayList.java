package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    /*
    Array List genel Tanimi:

           ArrayList<Type> arrayListName = new ArrayList<Type>();
                List<Type> arrayListName = new ArrayList<>();

            1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
               - ArrayList<int> hatali bir tanimlamadir. Type Wrapper class dedigimiz object türünden olmalidir
               - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
               - int'n wrapper class'i        --> Integer'dir
               - double'un wrapper class'i    --> Double'dir. vs...

           2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
               - ArrayList'ler tanimlamada .size(); belirleme zorunlulugu yoktur degistirilebilir.
           3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

   List declarations(tanımlama) :
   Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
    eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


   key word: List<Wrapper Class> name=

   List'e assaign etme(atama) :
   List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
   List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
   List<wrapper Class> name = new ArrayList<>() *****doğru
   List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
   ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

   List'e ilk değer atama (initialize):....
   1.yol : asList();
   ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
   2.yol : Listof();
   ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

   ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
   Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


   Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

*/
    public static void main(String[] args) {

        int sayi = 99;
        int[] arr = new int[5];
        int[][] arrMd = new int[5][6];

        // ArrayList tanımlama
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
        //arrylite veri ekleme
        name.add("22");
        name.add("safak");
        name.add("rukiye");
        name.add("ali");
        name.add("burjuva");
        name.add("proleterya");
        System.out.println("name = " + name);//name = [22, safak, rukiye, ali, burjuva, proleterya]
        numbers.add(55);
        numbers.add(65);
        numbers.add(34);
        numbers.add(31);
        numbers.add(9);
        numbers.add(96);
        System.out.println("numbers = " + numbers);
//2. yol arrayListe elaman ekleme
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "Bursa", "Aydın"));
        System.out.println("city = " + city);
        //3. yol List.of() methodu ile
        ArrayList<String> country = new ArrayList<>(List.of("madaskar", "almanya", "Polonya", "İtalya"));
        country.add(1, "Türkiye");
        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());
    }
}
