import java.math.BigInteger;
import java.awt.Robot;
import java.awt.event.KeyEvent.*;
import java.util.Scanner;

class Stopwatch
{
	public static void main(String args[])
	{
		Robot r = new Robot();
		r.keyPress(keyEvent.VK_ENTER);
			long start = System.nanoTime();
			System.out.println("start time :  "+start);
		
		r.keyPress(keyEvent.VK_ENTER);
			long stop = System.nanoTime();
			System.out.println("End time :  "+stop);
		        
		r.keyPress(keyEvent.VK_ENTER);
			long elapse = stop - start;
			System.out.println("Elapsed  time :  "+elapse);
		
	}
}