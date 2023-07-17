package ch23_AccessModifer;

public class C01_AccessModifler {

    /*
      1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
      Diğer class'lardan "private" class member'lari kullanamaz.

          2) Diğer package'lerden   olusturulan object için class'i import edilmeli

          3) Diğer package'lerden default class memberlara erişilemez.
           "default" ile "package private" es anlamlidir.

          4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

           5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
          için : a)Child class erişebilir.     b)Child class degil ise erişilemez.
           6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
           Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

  */
    //fields
    private int privateYas;
    int defaultYas ; //access modifier yazilmazsa default olur(package-private)
    protected int protectedYas;
    public int publicYas;

    public C01_AccessModifler() {

    }

    public void C01_AccessModifler() {
        System.out.println("pm siz const. dan selamlar");
    }
    C01_AccessModifler(int privateYas, int protectedYas) {
        System.out.println("pm si private ve protected olan const. dan selamlar");
        privateMethod();
        this.privateYas = privateYas;
        this.protectedYas = protectedYas;
    }
    // C01_AccessModifler objprivate =
    // new C01_AccessModifler(25,55);

   public void C01_AccessModifler(int privateYas, int protectedYas, int publicYas) {
        this.privateYas = privateYas;
        this.protectedYas = protectedYas;
        this.publicYas = publicYas;
    }
    private void privateMethod(){
        System.out.println("private method calisti");
    }
    protected void protectedMethod(){
        System.out.println("protectedMethod method calisti");
    }
    @Override
    public String toString() {
        return "C01_AccessModifier{" +
                "privateYas=" + privateYas +
                ", defaultYas=" + defaultYas +
                ", protectedYas=" + protectedYas +
                ", publicYas=" + publicYas +
                '}';
    }



}
