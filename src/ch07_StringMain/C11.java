package ch07_StringMain;

public class C11 {
    public static void main(String[] args) {
        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..
        String donation1 = " 150000   ".trim();
        String donation2 = " 200000    ".trim();
        String donation3 = " 2 00000    ".replace(" ","");
        System.out.println(donation1 + donation2);

       Integer d1 = Integer.valueOf(donation1);
        System.out.println("d1=" + d1);

        int d2 = Integer.valueOf(donation2);
        System.out.println("d2=" + d2);

       int d3 = Integer.valueOf(donation3);
        System.out.println("d3=" + d3);

        System.out.println("d1+d2=" + d1 + d2 );
        System.out.println("paresent ile çözüm");

        int d11=Integer.parseInt(donation1 );
        int d12=Integer.parseInt(donation2);
        System.out.println("d11 + d12=" + (d11 + d12));
    }
}
