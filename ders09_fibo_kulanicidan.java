package alg22no;

import java.util.Scanner;

public class ders09_fibo_kulanicidan {

	public static void main(String[] args) {
		// kullan�c�n�n istedi�i aral�ktaki fibo
		int a,b,c,baslangic,bitis;
		a=c=0; b=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�eri:");
		baslangic = scan.nextInt();
		System.out.println("Biti� de�eri:");
		bitis = scan.nextInt();
		int sayac = 1;
		while(c<bitis) {
			c = a + b;
			if(c>baslangic && c<bitis) {
				System.out.println(sayac +". bulunan Fibo =" +c);	
			}
			sayac++; //ka��nc� fibo oldu�unu bulmak i�in ekledik
			a=b; b=c;
		}
		
		
		

	}

}
