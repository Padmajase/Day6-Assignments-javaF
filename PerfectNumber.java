import java.lang.Math;
import java.util.Scanner;

class PerfectNumber {
	public static void main(String args[]) {

		System.out.println("Enter The number  :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 0;
		int divAddition = 0;

		for(i = 1; i < n; i++)
		{
			if(n % i == 0)
			{
				divAddition = divAddition +  i;
			}	
			
		} 
		if(divAddition == n)
		{
			System.out.print(n +" is the Perfect number  because its Divisors Addition is  "+ divAddition);
		}
		else
			System.out.print(n +" is not the Perfect number  because its Divisors Addition is  "+ divAddition);
	}
}