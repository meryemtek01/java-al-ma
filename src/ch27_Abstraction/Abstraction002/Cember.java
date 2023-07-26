package ch27_Abstraction.Abstraction002;

public class Cember extends Sekil {
    private  double yariCap;
    private final double pi=3.14;

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double alanHesapla() {
        return pi*yariCap*yariCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*pi*yariCap;
    }
}
