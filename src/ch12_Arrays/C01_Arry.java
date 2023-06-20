package ch12_Arrays;


import java.util.Arrays;

public class C01_Arry {
    /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
*/
    public static void main(String[] args) {
        //array tanımlama
        int a;//primitive data type tanımlanmadı
        int[] array;//declare edilen ama deger atanmayan int data type li ARRY
        // System.out.println("a = " + a);//veribale 'a' night not have been initialized
        //  System.out.println("arr="+arr);//Varibable arr night not have been initiolized

        //task nameArray isminde isimleri tutan array create ediniz

        String[] nameArray = {"rumeysa", "ahmet", "zeynep", "tommy", "ali", "ömer"};

        //HEM ATAMA HEM DE TANIMLAMA YAPILAN ARRAY
        //task number tutan array create ediniz

        int[] numArray = {11, 22, 333, 44, 55, 66, 77, 2, 6};//dublicate e izin veriyor

        //int [] sayiArr=new int[];
        int[] sayiarr = new int[5];
        sayiarr[1] =34;
        sayiarr[2] =9;
        sayiarr[3] =5;
                System.out.println("sayiArr = " + sayiarr);

        System.out.println("Arrays.toString(sayiArr)" + Arrays.toString(sayiarr));
        sayiarr[0] = 35;

        System.out.println("sayiarr.length = " + sayiarr.length);
   //task herbir array in son elemanınprint ediniz
        System.out.println("sayiarr[sayiarr.length-1] = " + sayiarr[sayiarr.length - 1]);
        System.out.println("numArray[nameArray.length-1] = " + numArray[nameArray.length - 1]);
        System.out.println("numArray[numArray.length-1] = " + numArray[numArray.length - 1]);
//task name array deki son elemanı update ediniz
        nameArray[nameArray.length-1] = "meryem";
      //  System.out.println("nameArray = " + nameArray);//
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));

        //loop ile array in elemanları arasında gezinme
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println("nameArray[i] = " + nameArray[i]);

        }
        System.out.println();
        //task numArry deki cift index olan elemanları print ediniz
        for (int i = 0; i <numArray.length ; i+=2) {
            System.out.println(numArray[i]+ " ");

        }
        System.out.println();
        //task namearry in elamanlarından 5 harfli olan elamanları pirint ediniz
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].length() == 5) {
                System.out.print(nameArray[i] + " ");
            }
        }
        System.out.println("  //sort  //");
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiarr) = " + Arrays.toString(sayiarr));

        Arrays.sort(nameArray);
        Arrays.sort(numArray);
        Arrays.sort(sayiarr);

        System.out.println("  //sort  //");
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiarr) = " + Arrays.toString(sayiarr));



    }
}




