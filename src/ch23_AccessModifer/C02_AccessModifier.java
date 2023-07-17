package ch23_AccessModifer;

import ch23_AccessModifer.newPackage.C03_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01_AccessModifler obj1=new C01_AccessModifler ();

        //CTE    C01_AccessModifier obj2=new C01_AccessModifier(25,55);
        //C01_AccessModifier(int, int)' has private access in 'ch23_AccessModifier.C01_AccessModifie
        obj1.defaultYas=33;
        obj1.protectedYas=66;
        obj1.publicYas=55;
        System.out.println("obj1 = " + obj1);

        obj1.protectedMethod();
        C01_AccessModifler obj2=new C01_AccessModifler();
     //   System.out.println("obj2.objprivate = " + obj2.objprivate);
        C03_AccessModifier obj3=new C03_AccessModifier();
        System.out.println("obj3.publicName = " + obj3.publicName);
      // obj3.protectedName=55;
    }

}
