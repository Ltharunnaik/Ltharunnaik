package sample.java;

public class Loping {

	public static void main(String[] args) {
		
		int i =1000;
	      while (i<=1000)
	      {
	        System.out.println(i);
	        i++;
	      }
	      
	      for (int x=1; x<=100; x++)
	       {
	         System.out.println(x);
	       }
	      
	      System.out.println("Even Numbers From 200 to 500");
	      for (int y = 200; y <= 500; y++) {
	            if (y % 2 == 0) {
	                System.out.print(y + " ");
	            }
	      }
	}

}
