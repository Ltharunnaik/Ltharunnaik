package sample.java;

public class BankingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable syntax
		
		int pincode = 500048;  // Datatype VariableName = Variablevalue;
		System.out.println(pincode);
		String area;
		area= "secundrabad";
		System.out.println(area);
		
		
		BankingMethods bank = new BankingMethods();
		greetCustomer();
		System.out.println("current balance is "+bank.getCurrentBalance());
		bank.deposit(2000);
		System.out.println("current balance is "+bank.getCurrentBalance());
		withdrawal(4000);
		System.out.println("current balance is "+bank.getCurrentBalance());
	}
	
	static int currentBalance = 10000;
	
	private static void greetCustomer() {
		System.out.println("Hello, Welcome to SBI baking application");
		
	}
	
	public void deposit( int amount) {
		currentBalance = currentBalance + amount ; 
		System.out.println("Amount is depopsit succesflyy");
	}
	
	public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withdrawn  succesflyy");
	}
	
	public  int  getCurrentBalance() {
		return currentBalance;
		
	}
	

}
