package javaconcepts;

//byte < short < int < long
//1 <2<4<8
//float < double
//4<8

public class TypeCasting {

	public static void main(String[] args) {
		
		int x=2;
		double y=3.5678;
		System.out.println(x+" "+y);
		
		//implicit type casting , assigning smaller type value to bigger type value
		//y=x;
		
		//System.out.println(x+" "+y);
		
		//not allowed , how can u assign bigger type to smaller type?
		//x=y;
		
		//can be done by explicit type casting , u can assign bigger type to smaller type
		x=(int)y;
		System.out.println(x+" "+y);
		
	}

}
