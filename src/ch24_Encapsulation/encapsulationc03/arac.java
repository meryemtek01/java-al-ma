package ch24_Encapsulation.encapsulationc03;

public class arac {
    /*
     TASK
 1- fieldları(encapsulated) model(String), renk(String), motor(int),
 yil (int)
olan Arac  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli constile, 1 adet parametresiz cons ile ,3 adet
 araba creat ediniz

5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı
veri girisine karsi kontrol ediniz.
  */
  private String model;
  private String renk;
  private int motor;
  private int yil;

    public arac() {

    }

    public arac(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;

        setMotor(motor);
        setYil(yil);
       // this.motor = motor;
       // this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor(int i) {

        return motor;
    }

    public void setMotor(int motor) {

        if (motor<100){
            System.out.println("fındık kdar motor olur mu ");

            this.motor = 1001;

        }else  this.motor = motor;


    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {

        if (yil<0){
            System.out.println("eksi yıl girdin farkındamısın");
            this.yil =(-1) *yil;
        }else if (yil>2025){
            System.out.println("o yılda ki arabanın burda ne isi var");
            this.yil =2023;
        }else
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
