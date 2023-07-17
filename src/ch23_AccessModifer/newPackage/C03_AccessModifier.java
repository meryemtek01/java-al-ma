package ch23_AccessModifer.newPackage;

import ch23_AccessModifer.C01_AccessModifler;

public class C03_AccessModifier {

    private  String privateName="Meryem hanım";
    String defaultName="Zeynep Hanım";
    public  String publicName="Ali bey";
    protected  String protectedName="Hasan bey";

    public static void main(String[] args) {

        C01_AccessModifler  obj1=new C01_AccessModifler ();
        System.out.println("obj1.publicYas = " + obj1.publicYas);
      // obj1.defaultYas=33;
      // obj1.protectedYas=66;


    }
}
