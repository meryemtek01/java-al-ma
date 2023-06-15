package halukh_taskÇalışma.tasks06_SwitchCase;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// kullanicidan VIP (Very Important Person) kisaltmasinda hangi harfin anlamini
		// istedigi soralim
		// girilen harfin aciklamasini yazdiralim

		Scanner input=new Scanner(System.in);
		System.out.print("\"VIP\" kısaltmasında hangi harfin anlamını istiyorsunuz: ");
		char ch=input.next().toLowerCase().charAt(0);


		switch (ch) {
			case 'v':
				System.out.println("V: Very");
				break;
			case 'i':
			case 'ı':
				System.out.println("I: Important");
				break;
			case 'p':
				System.out.println("P: Person");
				break;
			default:
				System.out.println("Unexpected character");
		}



	}
}
