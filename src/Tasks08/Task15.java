package Tasks08;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		String str = "jadsjl52kjşlk524524j5j24";
		int rakamSayisi = str.length()-str.replaceAll("\\d","").length();
		System.out.println(rakamSayisi);

		// cozum 2
		rakamSayisi=0;
		for (int i = 0; i <str.length() ; i++) {
			if (Character.isDigit(str.charAt(i))) rakamSayisi++;

		}
		System.out.println(rakamSayisi);
	}
}
