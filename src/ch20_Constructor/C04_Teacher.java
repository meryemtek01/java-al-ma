package ch20_Constructor;

public class C04_Teacher {
    //fields
    int id;
    String ad;
    String soyad;
    String brans;
    int tecrube;
    int yas;
    double maas;
    boolean emekliMi;


    public C04_Teacher(String ad, String soyad, String brans, int tecrube, int yas, double maas, boolean emekliMi) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.yas = yas;
        this.maas = maas;
        this.emekliMi = emekliMi;
    }

    public C04_Teacher() {

    }

    public void  dersSaati(){

        System.out.println("haftada 15 saat sonrası extra olur");
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", yas=" + yas +
                ", maas=" + maas +
                ", emekliMi=" + emekliMi +
                '}';
    }
}

