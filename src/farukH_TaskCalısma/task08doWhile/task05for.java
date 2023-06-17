package farukH_TaskCalısma.task08doWhile;

public class task05for {
    public static void main(String[] args) {
        int n = 5;
        int sayi = 1;
        for (int i = 1; i <= n; i++) {
            sayi = i;
            for (int j = 1; j <= i; j++) { //satır sayısı kadar yazılacak
                System.out.print(sayi + " ");
                sayi += (n - j); // n=5 j=1 sayi=5
            }
            System.out.println();
        }
    }
//1
//2 6    6= 2+ (n-1)
//3 7 10   7=3+ (n-1) , 10=7+(n-2)
//4 8 11 13
//5 9 12 14 15  9=5+(n-1)   12 = 9+(n-2)  14=12+(n-3)   15 = 14+(n-4)
}
