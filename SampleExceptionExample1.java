
public class SampleExceptionExample1 {

	public static void main(String[] args) {

		int x = 10;
		x = assign(x);
		System.out.println("x value=" + x);

	}

	static int assign(int x) {

		try {
			throw new ArithmeticException();

		} catch (Exception e) {

			x += 10;

			return x;
		} finally {

			x += 10;

		}
	}

	// op:
	// x value=20

}
