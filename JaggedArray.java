package javaconcepts;

// having different size columns 
// array of arrays and those arrays are of different size 

public class JaggedArray {

	public static void main(String[] args) {

		int[][] arr = {

				{ 1 }, { 1, 2, 3 }, { 1, 3 }

		};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}

	}

}
