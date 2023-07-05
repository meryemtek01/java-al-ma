package ch15_Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.

input : "m", "e", "r", "v", "e";
output : merve

input : "a", "l", "i";
output : ali

 */
        String [] arr1 = {  "m", "e", "r", "v", "e"};
        String [] arr2 = {  "a", "l", "i"};
concat1(arr1);
concat1(arr2);




    }//main sonu

    private static void concat1(String... var) {
        String ss="";
        for (String s: var){
           ss+=s;

        }
        System.out.println("ss = " + ss);
    }



}
