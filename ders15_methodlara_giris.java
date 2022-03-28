package alg22no;

public class ders15_methodlara_giris {
	
	static void hosgeldinYaz() { //void de�er d�nd�rmeyen methodlar�n ba��na yaz�l�r
		System.out.println("Methodlara ho�geldiniz!");
	} //bu method hem de�er d�nd�rm�yor, hem de de�er alm�yor
	
	static int topla(int a, int b) {// int t�r�nde de�eri return edecek
		return a+b;
	} //bu method hem de�er d�nd�r�r, hem de de�er al�r
	
	static void isimleHosgeldinYaz(String isim) {
		System.out.println(isim + " ho�geldin");
	}//de�er al�yor ama d�nd�rm�yor
	
	static String degerAlmadanDegerDondur(){
		return "Bu yaz� da method ile yazdr�ld�";
	}// de�er alm�yor ama de�er d�nd�r�yor
	
	
	public static void main(String[] args) {
		// methodlar
		// java projesinde en az bir tane main method bulunmal�d�r
		// s�n�f i�erisinde ise
		// istenildi�i kadar method olu�turulabilir
		hosgeldinYaz();
		hosgeldinYaz();
		
		int sonuc;
		sonuc = topla(13,29);
		System.out.println(sonuc);
		System.out.println(topla(67,56));
		
		isimleHosgeldinYaz("Mahmut");
		
		System.out.println(degerAlmadanDegerDondur());
	}

}
