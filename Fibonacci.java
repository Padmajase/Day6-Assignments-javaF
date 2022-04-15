import java.util.Scanner;

class Fibonacci {
	public static void main(String args[]) {

		System.out.println("Enter value upto which fibonacci series has to print  :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int fistNum = 0;
		int secondNum = 1;
		int lastNum = 0;
		
		while( lastNum <= n)
		{
			lastNum = fistNum + secondNum ;
			System.out.print(" " + lastNum + " ");
			fistNum = secondNum; 
			secondNum = lastNum  ; 
			
		} 
	}
}