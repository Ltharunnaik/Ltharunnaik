package sample.java;

public class Operators {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 20 ;
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		
		
		unnaryOperators();
		relationOperators();
		ConditionalOperators();
		AssigmentOperators();
	}
	
	public static void unnaryOperators() {
		int C = 10;
		int D = 5;
		System.out.println(C);  	//10
		System.out.println(++C); 	//11 preIncrement
		System.out.println(C++);	//11 postIncrement
		System.out.println(C);		//10
		
		System.out.println(D);		//5
		System.out.println(--D);	// 4
		System.out.println(D--);	//4
		System.out.println(D);		//3
	}
	
	public static void relationOperators() {
			
			int E = 9;
			int F = 5;
			System.out.println( E==F );
//			System.out.println( E!+F );
			System.out.println( E>F );
			System.out.println( E<F );
			System.out.println( E>F );
			System.out.println( E>= F);
			System.out.println( E<= F);
		}
		
	public static void ConditionalOperators() {
		 
		int I = 5;
		int j = 2;
		System.out.println( I> j && I<= j);
		
		/*
		 * &&
		 * true - true -> true
		 * true - false -> false
		 * false - true -> false
		 
		*/
		System.out.println( I != j || I ==j);
		
	}
	
	public static void AssigmentOperators() {
		
		int k = 2;
		int l = 3;
		System.out.println( k=l);
		System.out.println( k+=k);
		System.out.println( k-=l);
		System.out.println( k*= l);
		System.out.println( k/=l);
		System.out.println(k%=k);
	}
}
