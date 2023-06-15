package halukh_taskÇalışma.Challange01;

public class Task04_VariableCreate {//class blok

    public static void main(String[] args) { //main blok


        // dataType     dataName       assaignment      initialize(ilk değer value atama)   ;
        int yas = 48;
        System.out.println("yas = " + yas);// 48

        int id;// -> dataType ve dataName ile variable declaration(tanımama) yapıldı
        // System.out.println("id = " + id);//CTE -> initialize (ilk değer ataması) yapılmayan variable action alamaz

        id = 571622;//-> declaration yapılan variable assaignment (value) değer ataması yapıldı.

        System.out.println("id = " + id);
        String isim, meslek, cimbom, memeleket;//multiple çoklu tanımlama
        isim = "Safvet";

        int age = 33, yıl = 1905, boy = 190;//multiple tanımlama ve atama;
        System.out.println(age + " " + yıl + " " + boy);
        //Bir variable tanimlayin : x
        //Baska bir variable initialize edin : y
        //x variable initialize edin
        //y variable'ı yeni bir value ile update ediniz.

       // int x;
       // int y=69;
        int x, y=69;
        x=21;
        y=35;

        System.out.println(x + " " + y);// 21 35


    }//main sonu
}//Class sonu
