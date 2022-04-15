import java.util.Scanner;
import java.lang.Math;
class SquareRoot {
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number to calculate square root :");
		int num = sc.nextInt();
		Util.sqrt(num);
		
	}
}

class Util {
	
	static void sqrt(int num)
	{
		double squareRoot = Math.sqrt(num);
		System.out.println("Square Root of "+num+" = "+squareRoot);
			
	}
}