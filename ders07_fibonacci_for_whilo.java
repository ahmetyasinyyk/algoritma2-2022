package alg22no;

public class ders07_fibonacci_for_whilo {

	public static void main(String[] args) {
		// �lk 10 fibonacci say�s�n� bulal�m
		// for d�ng�s� ile
		int a,b,c,i,sayac;
		a = 0; b = 1; c=0; sayac=0;
		for(i=0;i<10;i++) {
			c = a + b;
			System.out.println(c);
			a=b; b=c;
		}
		
		a=c=0; b=1;
		while (sayac<10) {
			c = a + b;
			System.out.println(c);
			a=b; b=c;
			sayac++;
		}
		

	}

}
