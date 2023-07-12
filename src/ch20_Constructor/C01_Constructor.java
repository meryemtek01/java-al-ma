package ch20_Constructor;

public class C01_Constructor {
    /*
   1- constructor ismi Class name ile aynı olmalı.Buyuk harf ile başlamalı
   2- constructor create eedildigğinde name den sonra () {} mutlaka kullanılmalı
   3- eger p'li cons. create edilirse java default cons ezer(siler)
   4- cons. return type olmaz method'dan ayıran özelliğidir.
   5-Class create edildiginde java default cons. kendi create eder.
    */

//fields
    String str;//instance variable
    String selam="hello word";
    //default constructor

   // public C01_Constructor(){
    //
//}
    public static void main(String[] args) {
        C01_Constructor obj1=new C01_Constructor();

      //  new C01_Constructor(); pm siz contain
        C01_Constructor obj2=new C01_Constructor();
        C01_Constructor obj3=new C01_Constructor();
        C01_Constructor obj4=new C01_Constructor();


        System.out.println("obj1.str = " + obj1.str);//obj1.str = null
        System.out.println("obj1.selam = " + obj1.selam);//obj1.selam = hello word
        obj1.str="javaAslan";
        obj2.str="javaAtar";
        System.out.println("obj3.selam = " + obj3.selam);//obj3.selam = hello word

        System.out.println("obj1.str = " + obj1.str);//obj1.str = javaAslan
        System.out.println("obj2.str = " + obj2.str);//obj2.str = javaAtar
        System.out.println("obj4.str = " + obj4.str);//obj4.str = null
obj2.method();//object name ile static olmayan bir method call edildi.
obj4.method();//methoddan merhaba
    }
public void method(){
    System.out.println("methoddan merhaba");

}
}
