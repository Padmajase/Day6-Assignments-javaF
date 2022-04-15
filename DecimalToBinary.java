import java.util.*; 
import java.lang.*;

class DecimalToBinary 
{
	public static void main(String args[])
	{	
		System.out.println("Enter Decimal number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		A.toBinary(num);
	}
}

class A
{
	static void toBinary(int num)
	{
		String bNum = Integer.toBinaryString(num);
		System.out.println("binary number of Given Number "+num+" is " + bNum );
		
		int i = 1;
		int binary = 0;
		int rem;
		
		System.out.println("binary representation of "+num+" with (base 2)    :");
		while(num!=0){
			rem = num%2;
		   	binary += i*rem;    //concatenate remainders in bottom-up manner
		   	System.out.println(Integer.parseInt(binary,2));
		 	num = num/2;
		   	i=i*10;
		}
		
	}
}