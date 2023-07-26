package ch27_Abstraction.Abstraction002;

public class Dikdortgen extends Sekil{

    private double uzunKenar;
    private double kisanKenar;

    public Dikdortgen(double uzunKenar, double kisanKenar) {
        this.uzunKenar = uzunKenar;
        this.kisanKenar = kisanKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public double getKisanKenar() {
        return kisanKenar;
    }

    public void setKisanKenar(double kisanKenar) {
        this.kisanKenar = kisanKenar;
    }

    @Override
    public double alanHesapla() {
        return kisanKenar*uzunKenar;
    }

    @Override
    public double cevreHesapla() {
        return 2*(kisanKenar+uzunKenar);
    }

}
