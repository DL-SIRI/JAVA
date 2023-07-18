package operators;

public class AssignmentOperators {
	public static void main(String[] args)
	{
		int a = 4;
		int var;//4 bytes
		var = a;
		System.out.println("var using =:" +var);
		var += a;
		System.out.println("var using +=:" +var);
		var *= a;//
		System.out.println("var using *=:" +var);
		var -= a;//
		System.out.println("var using -=:" +var);
		var /= a;//
		System.out.println("var using /=:" +var);
	}

}
