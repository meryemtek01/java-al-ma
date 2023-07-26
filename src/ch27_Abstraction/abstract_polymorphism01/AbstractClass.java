package ch27_Abstraction.abstract_polymorphism01;

import ch04_JavaOperators.jo01_aritmetikOperators.A;

public abstract  class AbstractClass {//parent class

        public static void byLinkText(){//concrete method

            System.out.println("Link text super");

        }
        public void get(){//concrete method

            System.out.println("chrome");

        }
        abstract void  absMethod();

    }

    class Test extends AbstractClass {

        public static void byLinkText() {//concrete method

            System.out.println("Link text sub class");

        }

        public void get() {//concrete method

            System.out.println("firefox");

        }


        @Override
        void absMethod() {

            System.out.println("abs method override edildi");

        }

        public static void test() {

            System.out.println("test method");
        }

        public static void main(String[] args) {
            Test.byLinkText();//Link text sub class
            AbstractClass.byLinkText();//Link text super

           // AbstractClass obj = new AbstractClass();
            //'AbstractClass' is abstract; cannot be instantiated
            AbstractClass obj=new Test();//polymorphism kullanılarak create edilen obje
            obj.absMethod();//abs method override edildi Tesk class
            obj.get();//fire fox

        }



}
