package ch20_Constructor.Task20;

public class T02_ElektrikHesabi {
    int toplamTüketim;
    double oran=0.7;
    double fatura;

    public T02_ElektrikHesabi() {


    }

    public T02_ElektrikHesabi(int tüketim,int ay) {
        tüketimEkle(tüketim,ay);
    }

    public void tüketimEkle(int  tüketim,int ay) {

       toplamTüketim += ay * tüketim;
        System.out.println("toplamTüketim = " + toplamTüketim);
    }
    public double odenecekTutar(){
        return  fatura+=toplamTüketim*oran;

    }

    @Override
    public String toString() {
        return "T02_ElektrikHesabi{" +
                "toplamTüketim=" + toplamTüketim +
                ", oran=" + oran +
                ", fatura=" + fatura +
                '}';
    }
}
