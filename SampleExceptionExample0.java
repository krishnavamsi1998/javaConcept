
//with catch...
public class SampleExceptionExample0 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("before exception: ");
			int x=2/0;
			System.out.println("after exception: ");

			
		}
		catch(Exception e) {
		System.out.println(e);
		}
		finally
		{
			System.out.println("in finally ");
		}
		System.out.println("after try *catch finally");
		
		//op:
		//before exception: 
		//	java.lang.ArithmeticException: / by zero
		//	in finally 
		//	after try *catch finally
	}

}
