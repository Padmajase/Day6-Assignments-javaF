import java.util.*;

class CouponNumber
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of coupon  :");
		int coupon = s.nextInt();
		
		Set <Integer> duplicateCouponNumber = new HashSet<Integer> ();
		while ( duplicateCouponNumber.size() <= coupon)		
		{
			Random rand = new Random();
			duplicateCouponNumber.add(rand.nextInt(100));
			
		}
		System.out.println( " distinctCoupon numbers are "+ duplicateCouponNumber);
				
	}
}