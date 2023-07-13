package ch20_Constructor;

public class Myconstructor {

    int x = 3;
    int y = 5;

    public Myconstructor() {
        x += 1;
        System.out.println("x = " + x);

    }

    public Myconstructor(int i){
        this();//pm siz const CCIII edildi.
        this.y = i; //const a gelen I prn si this.y ye atandl
        x += y; // inst var x dgerine y eklendi
        System.out.println("x = " + x);

    }

    public Myconstructor(int i, int i2) {
        this(i2); //int pm li
        this.x -= i;
        System.out.println("x = " + x);
    }

    public static void main(String[] args){

        Myconstructor nc1=new Myconstructor(4,3);
    }
}
