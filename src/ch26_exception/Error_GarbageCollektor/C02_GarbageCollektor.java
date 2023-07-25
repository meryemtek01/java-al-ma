package ch26_exception.Error_GarbageCollektor;

public class C02_GarbageCollektor {
    public static void main(String[] args) {
        String str="";
        for (int i=0; i<1000; i++) {
            str+=i;
            System.out.println("str = " + str);
        }
    }
}
