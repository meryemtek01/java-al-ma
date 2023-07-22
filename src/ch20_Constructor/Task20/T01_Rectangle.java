package ch20_Constructor.Task20;

public class T01_Rectangle {

    int width, length, cevre,alan;
    public T01_Rectangle(){

    }

    public T01_Rectangle(int width, int length ) {
        this.width = width;
        this.length = length;
      //  this.cevre = cevre;
      //  this.alan = alan;
    }
    public int cevre() {
        return 2*(width+length);
    }
    public int alan() {
        return width*length;

    }


    @Override
    public String toString() {
        return "T01_Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", cevre=" + cevre +
                ", alan=" + alan +
                '}';
    }
}
