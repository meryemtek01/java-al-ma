package halukh_taskÇalışma.InterviewQuestions;

import java.util.ArrayList;

public class Q14_CreateRandomList_SetList {
    //Task->
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
       randomEkle(list);


    }

    private static void randomEkle(ArrayList<Integer> list) {
        int ciftsayıadedi=0;
        for (int i = 0; i < 10; i++) {
            int rastgeleSayi=(int) (Math.random()*20);//random sayı
           if ( rastgeleSayi%2==0 ) {//ramdom gelen sayı cift ise

               list.add(111);//random sayı yerine 111 liste eklendi
               // list.add(rastgeleSayi);// ramdom sayı yerine 111 liste eklendi
               ciftsayıadedi++;
           }else {//random gelen sayı tek ise

               list.add(rastgeleSayi); //0 - 20 arası random sayı liste ekler
           }


        }
        System.out.println( list);
        if (ciftsayıadedi==0){
            System.out.println("cift sayı yoktur");
        }


    }


}