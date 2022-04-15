import java.util.*;
class ReverseANumber
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter the number :");
		int n = s.nextInt();
		int reverse = 0;
		int remain = 0;

			while (n > 0)
			{
				remain = n % 10 ;
				reverse = reverse * 10 + remain;
				n = n /10;
			}
			System.out.println(reverse);
		
	}
}