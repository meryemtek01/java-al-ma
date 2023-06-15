package halukh_taskÇalışma.Challange04;

public class Task03 {
    // Task-> asagidaki fiyatlarin toplamini print eden code create ediniz.
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
            1) \\d    ==> tum rakamlar
                  \\D    ==> tum rakam disi character ler
            2) \\w   ==> A->Z		a->z			0->9    _
                 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
            3) \\s   ==> space
                 \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {
        String str1 = "$13.99"; //"13.99"
        String str2 = "$10.55";
        System.out.println("str1 = " + str1);// $13.99
        str1 = str1.replaceFirst("\\D", "");
        System.out.println("str1 = " + str1);// 13.99

        //str1 = str1.replace("\\D", "");
        // System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2); //$10.55
        str2 = str2.replaceFirst("\\D", "");
        System.out.println("str2 = " + str2); //10.55

        System.out.println(str1 + str2);
        double str1indobleHali = Double.parseDouble(str1);// string olan str1 double olarak atandı
        double str2indobleHali = Double.parseDouble(str2);// string olan str2 double olarak atandı
        System.out.println(str1indobleHali);
        System.out.println(str2indobleHali);
        System.out.println(str1indobleHali + str2indobleHali);//24.54

        // System.out.println("toplam : "+((Double.parseDouble(str1.replace("$", "")) + Double.parseDouble(str2.replace("$", "")))));
    }
}
