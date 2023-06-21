package ch12_Arrays;

public class C07_Arrays {
    public static void main(String[] args) {
        // task ->mdArr tum elemanlarını toplayan code create ediniz
        int [] [] mdArr = { {1,2,3 }, {10,23 },{103 }  };
        int toplam = 0;
        for (int i = 0; i < mdArr.length; i++) {
            for (int j = 0; j < mdArr[i].length; j++) {
                toplam += mdArr[i][j];//her bir katta ki daireye ayrı ayrı ulasıp toplama atar
            }
        }


        System.out.println(" toplam: " + toplam);
    }

}
