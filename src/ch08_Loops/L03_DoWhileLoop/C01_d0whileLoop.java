package ch08_Loops.L03_DoWhileLoop;

public class C01_d0whileLoop {
    public static void main(String[] args) {
        // While Loop >>önce sart kontrol edilir eger sart sonucu true alinirsa body action çalısır .
// do-while-loop >> önce body action calisir sonra sart kontrol edilir . sart true ise döngü devam eder .
// sart false ise döngü kırılır ve döngüden sonraki ilk satir calisir .
// do-while-loop >> game app.de daha cok kullanilir .
// Trick : while loop sart saglanmazsa hiç calişmayabilir ama do-while sart saglasin saglamasin en az bir kez calisir .
        int yas = 15;
        while (yas > 18) {
            System.out.println("girebilirsin while");
            yas--;
        }
        do {
            System.out.println("girebilirsin do while");
            yas--;
        } while (yas > 18);

    }
}
