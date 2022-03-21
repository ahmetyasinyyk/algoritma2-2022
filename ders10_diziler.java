package alg22no;

public class ders10_diziler {

	public static void main(String[] args) {
		// Arrays - Diziler
		// Java'da primitive yap�daki diziler Array olarak adland�r�l�r
		// Nesne tipi ise Listeler (ArrayList) olarak adland�r�l�r.
		int[] sayilar = {3,5,6,8,9,1,0}; // 7 elemanl� bir dizi tan�mlay�p de�erleri atad�k  
		System.out.println(sayilar[0]);//3
		System.out.println(sayilar[2]);//6
		System.out.println(sayilar[2+3]);//sayilar[5]
		//System.out.println(sayilar[7]);//ta�ma hatas�
		//System.out.println(sayilar[sayilar.length]);//ta�ma hatas�
		System.out.println(sayilar[sayilar.length-1]);// 6. indis
		System.out.println(sayilar[sayilar.length-sayilar.length]);// 7-7
		System.out.println(sayilar[167-163]);
		
		
		int[] dizi = new int[3]; //3 elemanl� bir dizi alan�n� Ram'de rezerve ettik
		dizi[0] = 5;
		dizi[1] = 0;
		dizi[2] = 1;
		dizi[0] = 7;
		//dizi[3] = 12; ta�ma hatas� al�r�z
	
	}

}
