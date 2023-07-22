package halukh_taskÇalışma.P044_ögrenciOgretYonetimi;

public class Kisi {
    private   String  ad_soyad;
    private   String  kimlikNo;
    private   int yas;

    public Kisi(String ad_soyad, String kimlikNo, int yas) {
        this.ad_soyad = ad_soyad;
        this.kimlikNo = kimlikNo;
       // this.yas = Math.abs(yas);//p gelen tas degeri mutlak degerini alır
        setYas(yas);
    }


    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad_soyad='" + ad_soyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
