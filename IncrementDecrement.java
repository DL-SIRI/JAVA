package operators;

public class IncrementDecrement {
	public static void main(String[] args)
	{
		int a = 10, b = 11, c = 12, d = 13 ;
		int result1, result2, result3, result4;
		System.out.println("Value of a: " + a);
		result1 = ++a;//pre increment
		System.out.println("After increment: " + result1);
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		result2 = --b;//predecrement
		System.out.println("After decrement: " + result2);
		System.out.println("Value of b: " + b);
		System.out.println("Value of c: " + c);
		result3 = c++;//pre increment
		System.out.println("After post increment: " + result3);
		System.out.println("Value of c: " + c);
		System.out.println("Value of d: " + d);
		result4 = d--;//predecrement
		System.out.println("After post decrement: " + result4);
		System.out.println("Value of d: " + d);
	}

}
