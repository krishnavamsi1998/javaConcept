public class SampleExceptionExample {

	public static void main(String[] args) {
		
		assign();
		
	}
	
	static Exception assign() {
		
		try {
			throw new ArithmeticException();
			
		}
		catch(Exception e)
		{
			
			System.out.println("in catch");
			return e;
		}
		finally {
			System.out.println("in finally");
		}
	}
	
	//op:
	//in catch
	//in finally
	

}
