package javaconcepts;

interface Addition {
	int add(int i, int j);
}

public class LambdaMultipleParameterExample {

	public static void main(String[] args) {

		Addition obj = (a, b) -> (a + b);
		System.out.println(obj.add(4, 5));

	}

}
