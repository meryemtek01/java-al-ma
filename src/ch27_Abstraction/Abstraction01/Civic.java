package ch27_Abstraction.Abstraction01;

public class Civic extends Lastik {
    /**
     * extend lastik yazılarak
     * java CTE verdi
     * çözüm olarak
     * a-> unimplemented method lar implement edilmesi
     */
//concerete class da abstract method tanımlanırmı hayır
 //   public abstract void absMethod();
    //abstract method in nan-abstract class

    @Override//implement edilen abs meth
    void motor() {
        System.out.println("civic için ideal motor 1.6");
    }

    @Override
    void koltuk() {
        System.out.println("koltuklar kadife");
    }

    @Override
    void kapi() {
        System.out.println("4. kapı");
    }

    @Override
    public void lastikEbat() {
        System.out.println("lastikler 18 inc");
    }

    public int vites(){
        return 6;
    }

}
