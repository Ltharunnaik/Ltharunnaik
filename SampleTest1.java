package sample.java;

public class SampleTest1 {
	
	
	public String school = "Narayana";
	public String Area = "Madhapur";
	public int Pincode = 508223;
	public String studentName = "tharun TSPS";
	public char deporment ='p';
	public int PHNumebr = 987654321;
	//public SampleTest test;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleTest1 application = new SampleTest1();
		System.out.println( "\n SchoolName"+application.school);
		System.out.println("\n SchoolArea"+application.Area);
		System.out.println("\n SchoolPincode"+application.Pincode);
		System.out.println("\n studentName"+application.studentName);
		System.out.println("\n depoement"+application.deporment);
		System.out.println("\n PHNumebr"+application.Pincode);
		System.out.println(application.name);
		
//		System.out.println(SampleTest.nm);
		
//		Tharun arun = new Tharun();
//		System.out.println(arun.numebr);
		
//		OuterClass outerObject = new OuterClass();
//		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		
		SampleTest1.SampleTest innerObject = application.new SampleTest();
		System.out.println(innerObject.nm);
		SampleTest1.SampleTest tarun = application.new SampleTest();
		System.out.println(tarun.name);
	
		
	}
	
	class SampleTest{
		public  String nm = "karthik";
		public String name= "tharun kumar";
	}
	
	public String name= " kumar";
}
