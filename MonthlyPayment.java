
import java.lang.Math;

class MonthlyPayment{
	public static void main (String args[])
	{
		int P = Integer.parseInt(args[0]);
		int Y = Integer.parseInt( args[1]);
		int R = Integer.parseInt(args[2]);
		System.out.println(P +" "+Y+" "+R);
		Util.monthlyPayment(P, Y, R);
		
	}
}

class Util {
	
	static void monthlyPayment(int P, int Y, int R)
	{
		int n = 12 * Y;
		double r = R / (12 * 100 );
		double payment = P * r / 1 - (Math.pow( 1+ r ,  (-n) ) );
		
		System.out.println("Monthly payment =" + payment);
	}
}