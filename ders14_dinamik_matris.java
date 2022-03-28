package alg22no;

import java.util.Random;
import java.util.Scanner;

public class ders14_dinamik_matris {

	public static void main(String[] args) {
		// kullan�c�dan sat�r s�tun say�s� al�p dinamik
		// matris olu�tural�m
		// bu matrisleri de toplayal�m
		int[][] m1,m2,mt;
		int satir,sutun;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Satir say�s� giriniz:");
		satir = scan.nextInt();
		System.out.println("S�tun say�s� giriniz:");
		sutun = scan.nextInt();
		
		m1 =  new int[satir][sutun];
		m2 =  new int[satir][sutun];
		mt =  new int[satir][sutun];
	
		Random r = new Random();
		int i,j;
		
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				m1[i][j] = r.nextInt(400)+100; // 100 ile 500 aras� rastgele say� �retiyoruz 
				m2[i][j] = r.nextInt(400)+100;
			}			
		}
		
		System.out.println("M1 matrisi***");
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				System.out.print(m1[i][j]+" ");
			}	
			System.out.println("");
		}
		
		System.out.println("\nM2 matrisi***");
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				System.out.print(m2[i][j]+" ");
			}	
			System.out.println("");
		}
		
		System.out.println("\nMtoplam matrisi***");
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				mt[i][j] = m1[i][j] + m2[i][j];
				System.out.print(mt[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
