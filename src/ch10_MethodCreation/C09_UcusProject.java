package ch10_MethodCreation;

import java.util.Scanner;

public class C09_UcusProject {
    /*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$

1. yolcu 12 yasindan kucukse toplam fiyat %50 indirim,

2. 12 ve 24 yas arasindaysa 10% indirim,

3. 65 yasindan buyukse 30% indirim,

4. bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */
  static  Scanner input=new Scanner(System.in);
  static double fiyatB=500*0.1;
  static double fiyatC=700*0.1;
    static double fiyatD=900*0.1;


    public static void main(String[] args) {
        System.out.println("JAVA ahava yollarına hoşeldiniz \nB  C  D rotalarından hangisine gidiceksiniz");
        String rota=input.next().toUpperCase();
        System.out.println(" gidiş geliş indirimli almak istermisiniz\ntek yon için \nçift yon için 2 ye basınız");
        int ucusyonu=input.nextInt();

        System.out.println("yaşınızı giriniz");
        int yas= input.nextInt();

        if (rota.equals("B") ||rota.equals("C") ||rota.equals("D") ) {
            if (yas>65) {//yas kontrol edilip ilgili indirim uygulaması
                if (rota.equals("B") ) {//rota B ise
                    if (ucusyonu==2) {//gidiş dönüş bilet aldıysa

                        System.out.println("****** fiyat hesaplanıyor*****");
                        System.out.println("65 yas ustu B rotasına gidiş dönüş fiyatınız: "+fiyatB*0.8*0.7*2+" $ ");
                    } else if (ucusyonu==1) {
                        System.out.println("****** fiyat hesaplanıyor*****");
                        System.out.println("65 yas ustu B rotasına tek yön gidiş fiyatınız: "+fiyatB*0.7+" $ ");

                    }else System.out.println("yanlıs bir seçim yaptınız");//1 veya 2 dışında bir tuslama yaparsa


                } else if (rota.equals("C")) {//rota C ise
                    if (ucusyonu==2) {//gidiş dönüş bilet aldıysa

                        System.out.println("****** fiyat hesaplanıyor*****");
                        System.out.println("65 yas ustu C rotasına gidiş dönüş fiyatınız: "+fiyatC*0.8*0.7*2+" $ ");
                    } else if (ucusyonu==1) {
                        System.out.println("****** fiyat hesaplanıyor*****");
                        System.out.println("65 yas ustu C rotasına tek yön gidiş fiyatınız: "+fiyatC*0.7+" $ ");

                    }else System.out.println("yanlıs bir seçim yaptınız");//1 veya 2 dışında bir tuslama yaparsa


                } else if (rota.equals("D")) {//rota D ise
                    if (ucusyonu==2) {//gidiş dönüş bilet aldıysa

                        System.out.println("****** fiyat hesaplanıyor*****");
                        System.out.println("65 yas ustu D rotasına gidiş dönüş fiyatınız: "+fiyatD*0.8*0.7*2+" $ ");
                    } else if (ucusyonu==1) {
                        System.out.println("****** fiyat hesaplanıyor*****");
                        System.out.println("65 yas ustu D rotasına tek yön gidiş fiyatınız: "+fiyatD*0.7+" $ ");

                    }else System.out.println("yanlıs bir seçim yaptınız");//1 veya 2 dışında bir tuslama yaparsa

                }else System.out.println("hatalı Rota girdin 65 yaiındsınız");//65 yas için yanlış rota girme ihtimali



            } else if (yas> 24 && yas>=12) {

                if (rota.equals("B")) {// rota B ise
                    if (ucusyonu == 2) {// ucus yonu cıft ise
                        System.out.println("**/*/*/*/*/*/*");
                        System.out.println("12 24 yas arası B rotasına gidiş dönüş bilet fiyatı  " + fiyatB * 0.9 * 0.8 * 2 + " $ ");

                    } else if (ucusyonu == 1) {
                        System.out.println("***/*/*/*/*/*/**");
                        System.out.println("12 24 yas arası B rotasına tek yön gidiş fiyatınız: " + fiyatB * 0.9 + " $ ");

                    } else System.out.println("yanlıs bir seçim yaptınız");//1 veya 2 dışında bir tuslama yaparsa


                } else if (rota.equals("C")) {// rota C ise
                    if (ucusyonu == 2) {// ucus yonu cıft ise
                        System.out.println("**/*/*/*/*/*/*");
                        System.out.println("12 24 yas arasıC rotasına gidiş dönüş bilet fiyatı  " + fiyatC * 0.9 * 0.8 * 2 + " $ ");

                    } else if (ucusyonu == 1) {
                        System.out.println("***/*/*/*/*/*/**");
                        System.out.println("12 24 yas arası C rotasına tek yön gidiş fiyatınız: " + fiyatC * 0.9 + " $ ");

                    } else System.out.println("yanlıs bir yöne gidiyorsun dikkat et");//1 veya 2 dışında bir tuslama yaparsa

                }else if (rota.equals("D")) {// rota D ise
                    if (ucusyonu == 2) {// ucus yonu cıft ise
                        System.out.println("**/*/*/*/*/*/*");
                        System.out.println("12 24 yas arası D rotasına gidiş dönüş bilet fiyatı  " + fiyatD * 0.9 * 0.8 * 2 + " $ ");

                    } else if (ucusyonu == 1) {
                        System.out.println("***/*/*/*/*/*/**");
                        System.out.println("12 24 yas arası D rotasına tek yön gidiş fiyatınız: " + fiyatD * 0.9 + " $ ");

                    } else System.out.println("yanlıs bir yöne gidiyorsun dikkat et");//1 veya 2 dışında bir tuslama yaparsa

                }else System.out.println("yanlış rota 12 24 yas arası");



                } else if (yas<12) {
                if (rota.equals("B")) {//b rotası için
                    if (ucusyonu == 2) {
                        System.out.println("/****/****/*****/");
                        System.out.println("yas 12 den küçük B rotasına çift yöne bilet fiyatınız  " + fiyatB * 0.5 * 0.8 * 2 + " $ ");

                    } else if (ucusyonu == 1) {
                        System.out.println("/****/****/*****/");
                        System.out.println("yas 12 den küçük B rotasına çift yöne bilet fiyatınız  " + fiyatB * 0.5+" $ ");

                    } else System.out.println("öyle bir yön yok");


                } else if (rota.equals("C")) {//b rotası için
                    if (ucusyonu == 2) {
                        System.out.println("/****/****/*****/");
                        System.out.println("yas 12 den küçük C rotasına çift yöne bilet fiyatınız  " + fiyatC * 0.5 * 0.8 * 2 + " $ ");

                    } else if (ucusyonu == 1) {
                        System.out.println("/****/****/*****/");
                        System.out.println("yas 12 den küçük C rotasına çift yöne bilet fiyatınız  " + fiyatC * 0.5 + " $ ");

                    } else System.out.println("öyle bir yön yok");


                } else if (rota.equals("D")) {//b rotası için
                    if (ucusyonu == 2) {
                        System.out.println("/****/****/*****/");
                        System.out.println("yas 12 den küçük D rotasına çift yöne bilet fiyatınız  " + fiyatD * 0.5 * 0.8 * 2 + " $ ");

                    } else if (ucusyonu == 1) {
                        System.out.println("/****/****/*****/");
                        System.out.println("yas 12 den küçük D rotasına çift yöne bilet fiyatınız  " + fiyatD * 0.5 + " $ ");

                    } else System.out.println("öyle bir yön yok");

                }
                } else {
                    System.out.println("sana özel indirim yok");//24 ve 65 yaş arası yaş buraya düşer
                    if (rota.equals("B")) {
                        if (ucusyonu == 2) {
                            System.out.println("***///*****////***");
                            System.out.println("24 65 yas için B rotasına çift yön bilet fiyatınız" + fiyatB * 0.8 * 2 + " $ ");
                        } else if (ucusyonu == 1) {
                            System.out.println("***///*****////***");
                            System.out.println("24 65 yas için B rotasına çift yön bilet fiyatınız" + fiyatB + " $ ");
                        } else System.out.println("yön yanlış dikkat ");


                    } else if (rota.equals("C")) {
                        if (ucusyonu == 2) {
                            System.out.println("***///*****////***");
                            System.out.println("24 65 yas için C rotasına çift yön bilet fiyatınız" + fiyatC * 0.8 * 2 + " $ ");

                        } else if (ucusyonu == 1) {
                            System.out.println("***///*****////***");
                            System.out.println("24 65 yas için C rotasına çift yön bilet fiyatınız" + fiyatC + " $ ");
                        } else System.out.println("yön yanlış dikkat ");

                    } else if (rota.equals("D")) {
                        if (ucusyonu == 2) {
                            System.out.println("***///*****////***");
                            System.out.println("24 65 yas için D rotasına çift yön bilet fiyatınız" + fiyatD * 0.8 * 2 + " $ ");

                        } else if (ucusyonu == 1) {
                            System.out.println("***///*****////***");
                            System.out.println("24 65 yas için D rotasına çift yön bilet fiyatınız" + fiyatD + " $ ");
                        } else System.out.println("yön yanlış dikkat ");


                    } else{ System.out.println("öyle bir yön yok");


                }
            }
            }else System.out.println("yanlış rota girdiniz");




    }//main sonu





}//class sonu
