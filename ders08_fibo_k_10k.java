package alg22no;

public class ders08_fibo_k_10k {

	public static void main(String[] args) {
		// 1000 ile 10000 aras�ndaki fibo
		
		int a,b,c;
		a=c=0; b=1;
		while (c<10000) {// for d�ng�s�  ile yap�m�n� �dev olarak ver
			c = a + b;
			if(c>1000 && c<10000) System.out.println(c);
			a=b; b=c;
		}

	}

}
