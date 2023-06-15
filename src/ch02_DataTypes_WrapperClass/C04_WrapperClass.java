package ch02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name = "zeynep hanım";
        int age = 33;
        System.out.println(name.toUpperCase());//ZEYNEP HANIM
        Integer age2 = 35;
        String number = "12345";

               String tc = "123456789";
        String id = "12345";
        System.out.println(tc + id);//12345678912345
        System.out.println(Integer.valueOf(tc));//123456789
        System.out.println(Integer.valueOf(id));//12345
        int yenitc = Integer.valueOf(tc);
        int yeniID = Integer.valueOf(id);
        System.out.println(yenitc + yeniID);//123469134

        /*String tc = "123456789";
        String id = "12345";*/ //ifadeleri ıntegere cevirilecek
        int idyeni= Integer.parseInt(id);
        int tcyeni=Integer.parseInt(tc);
        System.out.println(idyeni+tcyeni);//123469134
        String okulno="12345ABCDEF";
        // **** hatalı kod runtimeErro   int okulnoyeni=Integer.valueOf(okulno);
//Exception in thread "main" java.lang.NumberFormatException: For input string: "12345ABCDEF"
    byte maxDegerByte=Byte.MAX_VALUE;
    byte minDegerByte=Byte.MIN_VALUE;
        System.out.println("maxDeger="+maxDegerByte);//maxDeger=127
        System.out.println("minDeger="+minDegerByte );//mindeger=-128
//Autoboxing
        //boolean bPrimitive=ture;
       // Boolean bwrapper=bPrimitive;

        //boxing
       // Integer numberWrapper=55;

        //Unboxing
        //int numberPrimitive= numberWrapper;

    }
}
