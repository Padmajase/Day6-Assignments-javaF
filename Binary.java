import java.util.*; 
import java.lang.*;

class Binary 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		String bNum = Integer.toBinaryString(num);
		System.out.println("binary number of Given Number "+num+" is " + bNum );
		
	 	int c = (Integer.bitCount(num)) * 4/2 ;
		System.out.println(c);

		String remainder = 0;
		String reverse = 0;
		while( count != c )
		{
			String remainder = bNum % 10;
			reverse =( reverse * 10 ) + remainder;
			bNum = bNum / 10;
			count++;
		}
		
		swapNum = reverse+""+bNum;
		System.out.println("After swapping nibbles the number is :"+swapNum);
		System.out.println("Decimal number of swap number  is :" +Integer.parseInt("swapNum",2));		
	}
}