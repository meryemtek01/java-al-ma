package ch08_Loops.L02_WhileL00p.Tasks08_whileLoops;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

			Scanner input = new Scanner(System.in);
		System.out.println("bir metin giriniz");
		String str=input.nextLine().toLowerCase();//girilen str degeri kucuk harfe atandı
		//"selam111aaa345-***-/"
int harfsayisi=0;
int rakamsaiyisi=0;
int ozelkaraktersayisi=0;
int index=0;
while (str.length()>index){
	if (Character.isDigit(str.charAt(index))) rakamsaiyisi++;
	else if (Character.isAlphabetic(str.charAt(index))) harfsayisi++;
	else ozelkaraktersayisi++;
	index++;

	}
		System.out.println("rakamsaiyisi = " + rakamsaiyisi);
		System.out.println("harfsayisi = " + harfsayisi);
		System.out.println("ozelkaraktersayisi = " + ozelkaraktersayisi);
	}


}
