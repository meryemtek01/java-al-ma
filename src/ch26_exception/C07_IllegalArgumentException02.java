package ch26_exception;

public class C07_IllegalArgumentException02 {

    public static void main(String[] args) {

        try {
            System.out.println("try block bası");
            exceptionMethod();
            System.out.println("try block sonu");
        } catch (Exception e) {
            System.out.println("catd block bası");
            System.out.println("e = " + e);

            System.out.println("e.getMessage() = " + e.getMessage());
          //  e.printStackTrace();//her kod bittiğinde hatayı yazar
            System.out.println("catd block sonu");

            // throw new RuntimeException(e);
        }

        System.out.println("main sonu tum kodlar calıştı");

    }

    public static void exceptionMethod(){

        throw new IllegalArgumentException("illegalArgumentException hatası alındı");
    }


}
