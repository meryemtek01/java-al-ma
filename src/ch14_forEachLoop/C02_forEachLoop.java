package ch14_forEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {
// task bir md array in elamanlarının çarpımını print eden code create ediniz...-> with for-each
        int [] [] arr = { {2,5,6,8 }  , {9,2,5,8 } , {3,5,7,9}};

        int carpim = 1;

        for (int[]ictekiArray: arr) {
            for (int eleman :ictekiArray) {
                //burada merbir elemana dokunabiliriz
                carpim *= eleman;
            }
        }

        System.out.println("Çarpım: " + carpim);//Çarpım: 326592000

for(int i=0; i<arr.length;i++) {
    for(int j=0; j<arr[i].length;j++){
        carpim *= arr[i][j];
    }
}
        System.out.println("Çarpım: " + carpim);//Çarpım: 326592000


    }
}
