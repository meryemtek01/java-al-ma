package ch27_Abstraction.Abstraction01;

public class CRV extends Honda {

    @Override
    void motor() {
        System.out.println("motor 3.5");
    }

    @Override
    void koltuk() {
        System.out.println("8  ileri koltuk");
    }

    @Override
    void kapi() {
        System.out.println("kapılar yukarı acılır");
    }

    public void sunroof() {

        System.out.println("cam tavan komple");
    }
}
