package ch19_StringBuilder_method;

public class n0t_StringBuilder {
    public static <StrigBuiIder> void main(String[] args) {
     /*   appent(String) Verilen StringBuiIder sonuna girilen String ekler.
        appent(String, index, index)
                -ş Verilen StringBuilder sonuna girilen Strinğin index (dahil) index(hariç) arasındaki parçasını
        ekler.
                lenght() -ş Verilen StringBuilder uzunluğunu return eder.
                capacity()
        Verilen StringBuilder kapasitesini return eder. Parametre olarak ilk uzunluk atamazsa default olarak capacity 16
        atanır.
                charAt(index) Girilen index'teki karakteri return eder.
        delete(index,index) -ş Girilen arasındaki String parçayı delete eder.
        deleteChartAt(index) Girilen index'deki karakteri delete eder.
        indexOf(String) Girilen String'in index'ini return eder StrinBuilder'da olmayan String girilirse -1 return eder.
        indexOf(String,index) -ş Girilen String'in verilen index'den sonraki index'ini return eder StrinBuilder'da olmayan String girilirse
        -I return eder.
                lasIndexOf(String) Girilen String'in kullanıldığı son index'ini return eder. StrinBuilder'da olmayan String girilirse -1 return
        eder.
                -h Girilen String'in verilen index'den öncekiindexfini return eder. StrinBuilder'da olmayan String
        girilirse -I return eder.
StringBuilder Methods
insert(index,String) -ş Girilen String'i verilen index'den itibaren ekler.
-ş Verilen index'den itibarengirilen String'in offset index'inden len index'ine kadar ekler.
-ş Verilen başlangıç ve bitiş index'leri arasındaki kısmı girilen String ile değiştirir.
reverse(StringBuilder) -ş Verilen StringBuilder ters cevirir.
setCharAt(index,char) -ş Verilen karakteri girilen index'deki karakter ile değiştirir.
subSequence(index,index) -ş Verilen StringBuilder'in girilen index' ler arasındaki bölümünü return eder.
subString(index) -ş Verilen StringBuilder'in girilen index'den sonraki bölümünü return eder.
toString() Verilen StringBuilder'in String'e çevirir. StringBuiIder String method'ları cali edecek duruma getirilir.
trimToSizeO -ş Verilen StringBuilder'in capacitYdeki fazlalıkları siler ve length ile capacity eşitlenir.
compareTo(StringBuilder) Verilen StringBuilder'in girilen StringBuilder ile karakterlernin eşitliğini kontrol eder eşitse 0
return eder.
StringBuilder Methods
0______________
Girilen StringBuilder ile verilen Ş!yğpgBuiIder'i hem referans değeri hem de karakterleri ile
eşitliğini kontrol eder true-false return eder.
method ile gpççg!pyğ gi çalışır.
ı ğ TRICK•J
StringBui1der si z
StringBui1der s2
new
new
System. out.println (s2. equa1s(s2)) ;
// false
System.out.println(sl -z s2);
// false
StringBuilder
W hat is the rcsult of the following codc?
7: StringBuilder Sb z new StringBuiIder();
8: Sb. . insert 1,
(K "bb”) . insert(4, "
9: System.out.println(sb) ;
CCC") ;
A.
C.
D.
E.
F.
abbaaccc
abbaccca
bbaaaccc
bbaaccca
An exception is thrown.
The code does not compİIe.


       // String numbers ="012345678”;
      //  System.out.println(numbers.substring(1, 3));
      //  System.out.println(numbers. substring(7,7));
      //  System.out.println(numbers. substring(7));

       int total=0;
        StrigBuiIder letters = (StrigBuiIder) new StringBuilder("abcdefg");
        total +=letters.substring(l, 2).length();
        total +=letters.substring(6, 6) . length();
        total += letters.substring(6, 5) . length();
        System.out.println(total);
*/

    }

}
