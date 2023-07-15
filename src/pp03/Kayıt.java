package pp03;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {//step 2
   static ArrayList<Kullanıcı> kullanıcılar=new ArrayList<>();//Kullanıcı classdan uretilen obj
public static ArrayList<Kullanıcı> kayıtAl(){//
  // Scanner input=new Scanner(System.in);
   System.out.println("agam adını giriniz");
   //String ad=input.nextLine();
   Kullanıcı k1obj=new Kullanıcı(new Scanner(System.in).nextLine(), LocalDateTime.now());//name ve kayıt zamanı
kullanıcılar.add(k1obj);

return kullanıcılar;
}
public static void sanslıKullanıcıBul(ArrayList<Kullanıcı>kllnc){// Step 3
   for ( Kullanıcı  avuc:kllnc    ) {
      if (avuc.kayıtZamanı.getSecond()>=10){//tekrardaki her bir kullanıcı obj kayıt zamanı second
         System.out.println(avuc.name+"  şanslı kişisiniz sisteme giriş zamanınız : "+avuc.kayıtZamanı);

      }else  System.out.println(avuc.name+"  şanslı kişisdeğilsiniz :(  "+avuc.kayıtZamanı);

   }

}
public static void listele(ArrayList<Kullanıcı> kullanıcı){

   System.out.println(kullanıcı);
}





}
