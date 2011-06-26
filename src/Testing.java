import java.util.Date;


public class Testing {

	Date aDate = new Date();
	String aString = "x";
	int anInt = 1;
	Integer anInteger = new Integer(2);
	
	public static void main(String[] args) {
		Testing testing = new Testing();
		
		System.out.println(testing.aDate + " " + 
				testing.aString + " " + 
				testing.anInt + " " + 
				testing.anInteger);
		
		testing.doTest(testing.aDate, testing.aString, 
				testing.anInt, testing.anInteger);
		
		System.out.println(testing.aDate + " " + 
				testing.aString + " " + 
				testing.anInt + " " + 
				testing.anInteger);

		testing.doTest2(testing);
		
		System.out.println(testing.aDate + " " + 
				testing.aString + " " + 
				testing.anInt + " " + 
				testing.anInteger);
		
}

	private void doTest2(Testing testing) {
		testing.aDate = new Date();
		testing.aString = "z";
		testing.anInt = 111;
		testing.anInteger = 123;
		System.out.println(testing.aDate + " " + 
				testing.aString + " " + 
				testing.anInt + " " + 
				testing.anInteger);

		
	}

	private void doTest(Date aDate2, String aString2, int anInt2,
			Integer anInteger2) {
		
		aDate2 = new Date();
		aString2 = "y";
		anInt2 = 11;
		anInteger2 = 12;

		System.out.println(aDate2 + " " + 
				aString2 + " " + 
				anInt2 + " " + 
				anInteger2);

		
	}
}
