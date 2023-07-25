package ch26_exception.final_finally_finalize;

public class F01_Child extends F01_Parent {
    @Override
    public  void testMethod() {
        System.out.println("guven kontrole mani değildir");
    }

   // @Override
   // public  void finalMethod() {
   //     System.out.println("final methoddan gelirlerse");
   // }
}
