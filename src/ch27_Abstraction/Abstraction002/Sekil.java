package ch27_Abstraction.Abstraction002;

public abstract class Sekil {//parent class
    private  String name;
    public Sekil(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public abstract double alanHesapla();//abs. method
    public abstract double cevreHesapla();//abs. method

    public String ciz() {
        return name +"isimli sekliniz çiziliyor";
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "\n sekil alanı:"+this.alanHesapla()+
                "\n sekil cevresi:"+this.cevreHesapla()+
                "\n cizilecek sekil:"+this.ciz()+
                '}';
    }
}
