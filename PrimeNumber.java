import java.util.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter the number :");
		int n = s.nextInt();
		int flag = 0;

		if(n==0 || n==1)
			System.out.println(n+"  is not prime number:");
		else
		{
			for(int i=2; i <= n/2; i++)
			{
				if(n%i == 0)
				{	
					flag = 1;
					System.out.println(n+"  is not prime number:");
					break;
				}
			}
			if(flag == 0)
				System.out.println(n+"  is  prime number ");
		}
	}
}