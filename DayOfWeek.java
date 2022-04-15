import java.util.Scanner;
import java.lang.Math;
class DayOfWeek{
	public static void main (String args[])
	{
		//Scanner sc = new Scanner (System.in);
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt( args[1]);
		int y = Integer.parseInt(args[2]);
		System.out.println(d +" "+m+" "+y);
		Util.dayOfWeek(d,m,y);
		
	}
}

class Util {
	
	static void dayOfWeek(int d,int m,int y)
	{
		int yi = y - (14 - m) / 12;
		int x = yi + yi / 4 - yi / 100 + yi / 400;
		int mi = m + 12 * ((14 - m) / 12) - 2;
		int di = (d + x + 31 * mi / 12) % 7;
		
		switch(di){
			case 0 :System.out.println("day for given date is Sunday");
				break;
			case 1 :System.out.println("day for given date is Monday");
				break;
			case 2 :System.out.println("day for given date is Tuesday");
				break;
			case 3 :System.out.println("day for given date is Wednsday");
				break;
			case 4 :System.out.println("day for given date is Thursday");
				break;
			case 5 :System.out.println("day for given date is Friday");
				break;
			case 6 :System.out.println("day for given date is Saturday");
				break;
			default :System.out.println("Invalid");
				break;
		}
			
	}
}