package first.program;

public class Bank {
//	accessModifier(public) staticORNonstatic returnType MethodName[(void)annadhi elanti datane return cheyanapudu void nee upayogisthamu](Parameters) throws ExceptionsList
	// bank application:
	
	
	static int currentBalance = 10000;
	public static void greecusmoter() {
		// method body
		
		System.out.println("Hello welcome to the banking application");
	}
	
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("amount is deposited successfully");
	}
	
	public static void withdrawal(int amount) {
		
		currentBalance = currentBalance - amount;
		System.out.println("amount is withdrawn successfully");
	}
	
	public int  getcurrentbalance( ) {
		
		return currentBalance ;
	}
	public static void main(String[] args) {
		
		
		Bank bank =new Bank();
		System.out.println("current balance is : "+bank.getcurrentbalance());
		greecusmoter();
	    bank.deposit(500);
	    System.out.println("current balance is : "+bank.getcurrentbalance());
		withdrawal(300);
		System.out.println("current balance is : "+bank.getcurrentbalance()); 
		
	}
}
