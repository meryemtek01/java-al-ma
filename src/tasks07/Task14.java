package tasks07;

public class Task14 {
    public static void main(String[] args) {


       String str="Ahmet".toLowerCase() ;
       //ehmat

     str=str.replace('a','*');
        System.out.println(str);
        str=str.replace('e','a');
        str=str.replace('*','e');
        System.out.println("degişen  "+str);

        String ksrt=str.toLowerCase();
        String bstr=ksrt.replace("a","b");
        String estr=bstr.replace("e","a");
        System.out.println("estr.replace(\"b\",\"e\") = " + estr.replace("b", "e"));



    }
}

