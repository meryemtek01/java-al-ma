package ch18_immutabelclas;

public class C03_OCA_equals {
    public static void main(String[] args) {

        String a="";

        String c="2cfalse";
        a+=2;
        a+='c';
        a+=false;
        System.out.println("a = " + a);
        String b="2cfalse";
        if (a==b){//bu sart çalışmas referans degeri farklı
            System.out.println( "(a==b)  çalışır");


        }

        if (a=="2cfalse"){//referanc yokkı çalışmaz
            System.out.println("a==\"2cfalse\"");


        }
        if (c==b){// çalışır

            System.out.println("(c==b)");
        }

        if (a.equals("2cfalse")){//çalışır
            System.out.println("(a.equals(\"2cfalse\")");
        }
    }

}
