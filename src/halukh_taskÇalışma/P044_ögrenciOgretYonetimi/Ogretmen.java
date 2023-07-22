package halukh_taskÇalışma.P044_ögrenciOgretYonetimi;

import pp03.Kayıt;

public class Ogretmen extends Kisi {
    public String arananOgretmenKimlikNo;//

    private  String bolum;
    private   String sicilNo;

    public Ogretmen(String ad_soyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(ad_soyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                "} " ;
    }
}
