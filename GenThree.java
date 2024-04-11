/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) 
	{
		// Put your code here	
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = (int)(a + Math.random() * (b - a));
		int y = (int)(a + Math.random() * (b - a));
		int z = (int)(a + Math.random() * (b - a));
		
		

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("The minimal generated value was " + Math.min(x, Math.min(y, z)));
	}
	
}
