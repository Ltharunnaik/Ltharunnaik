package looping;

public class loopingTest {

	public static void main(String[] args) {
//		print 1 to 100 values
	 
		
		
		int i=1;
		while (i<=100)
		{
			System.out.println(i);
			i++;
		}
		
		int x = 0;
		while (x<=10) {
			System.out.println(x);
			x++;
		}

		
		int a = 2;
		int b = 1;
		int c ;
		while(b<= 10){
			//c = b * a;
//			System.out.println("\n 2x1="+b*a);
			System.out.println("\n 2+1="+b+a);
//			System.out.println("\n 2|1="+ a+b);
			b++;
		}
		
		int k = 2;
		int y = 1;
		int z;
		while(y<10) {
			z= y+k;
			y++;
			System.out.println(z);
		}
		
		
		int v = 0;
		do {
			System.out.println(v);
			v++;
		}
		while(i<=10);
		System.out.println("welcome ");
		
		for(int m=10; m<=20; m++) {
			System.out.println("\n forcondition"+ m);
		}
		
		System.out.println("Even Number");
		int q = 50;
		for(int l=20; l<=q; l++) {
			if(l %2==0) {
				System.out.println(l);
			}
		}

		System.out.println("Odd Number");
		int o = 30;
		for(int p=10; p<=o; p++) {
			if(p%2!=0) {
				System.out.println(p);
			}
		}
	}	
}
