package ch02_DataTypes_WrapperClass;

public class C03_Concatination {
    public static void main(String[] args) {
        char ch ='A';
        char ch2='C';
        System.out.println(ch+ch2);//132
        System.out.println('A'+'C'+ch);//197
        System.out.println("A"+"C");//AC
        String name=" zeynep ";
        String lastame=" fıtnat ";
        int a=7;
        int b=11;
        System.out.println(name+lastame+a+b);//zeynepfıtnat711
        System.out.println(a+name+lastame+b);//7zeynepfıtnat11
        System.out.println(a+b+name+lastame);//18zeynepfıtnat
        System.out.println(name+lastame+(a+b));//zeynepfıtnat18
        System.out.println(name+(a-b)+(a-b));// zeynep -4-4
        System.out.println(name+((a-b)+(a-b)));// zeynep -8

        char nam='1';
        System.out.println(name+nam);// zeynep 1
        System.out.println(a+nam+name);//56 zeynep 1 ascıı degeri 49 dur a nın degeri 7 oldugu için toplama işlemi yapıldı 56
        System.out.println(name+(nam+b));//zeynep 60
        System.out.println(a+name+nam);//7 zeynep 1


  }//main sonu
}
