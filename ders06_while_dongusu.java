package alg22no;

import java.util.Scanner;

public class ders06_while_dongusu {

	public static void main(String[] args) {
		//while
		//do-while d�ng�leri
		int sayac = 0;

		while (sayac<10) {
			System.out.println(sayac + ". ad�m");
			sayac++;
		}

		//en az bir ad�m atar
		int sayac2 = 11;
		do {
			System.out.println(sayac2+" sayac2 de�eri");
			//sayac2++;
		} while (sayac2<10);

		int sifre = 1234;
		int pass = 0;
		Scanner scan = new Scanner(System.in);
		
		while(sifre != pass) {			
			System.out.print("�ifreyi giriniz:");
			pass = scan.nextInt();
			if(sifre==pass) break; //tek sat�r oldu�u i�in {} blok a�mad�m
			else System.out.println("Yanl�� �ifre!");
		}

	}
}
