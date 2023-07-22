package halukh_taskÇalışma.P044_ögrenciOgretYonetimi;

public class Ogrenci extends Kisi{
    public String arananOgrcKimlikNo;//öğrenci obj uretecek pojo class


 private    String numara;
    private   String sinif;

    public Ogrenci(String ad_soyad, String kimlikNo, int yas, String numara, String sinif) {
        super(ad_soyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return super.toString() +'\'' +
                "numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                "} " ;
    }
}
