package sayhello;

public class MaximumNumber {
	public static void main(String args[])
	{
		int a = 55 , b = 25 , c =45 , max;
		max =(a > b) ? (a > c ? a : c) : (b > c ? b : c );
		System.out.println("MaximumNumber among " +a+ ", " + b +", and " +c+ " is "+ max );
	}

}
