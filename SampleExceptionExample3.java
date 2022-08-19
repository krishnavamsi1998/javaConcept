
//without catch..
public class SampleExceptionExample3 {

	public static void main(String[] args) {
		try
		{
			System.out.println("before exception: ");
			int x=2/0;
			System.out.println("after exception: ");

			
		}		
		finally
		{
			System.out.println("in finally ");
		}
		System.out.println("after try (without catch) finally");
		
		//op :
		//before exception: 
		// finally 
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//	at SampleExceptionExample3.main(SampleExceptionExample3.java:9)

	}

}
