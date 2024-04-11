/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) 
	{
		// Put your code here
		int AllCash = Integer.parseInt(args[0]);
        int Quarters = AllCash / 25; 
        int Cents = AllCash % 25;
        if (Quarters == 1) 
        {
            System.out.println("Use " + Quarters + " quarter and " + Cents + " cents");
        }
        else
        {
            System.out.println("Use " + Quarters + " quarters and " + Cents + " cents");
        }
        
	}
}