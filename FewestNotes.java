import java.util.*; 
import java.lang.*;

class FewestNotes 
{
	public static void main(String args[])
	{	
		int arr[] = new int[]{1, 2, 5, 10, 50, 100, 500, 1000};
		int arr2[] = new int[8];
		
		Random rand = new Random();
		for(int i = 0; i<arr.length; i++)
		{
			int r = rand.nextInt(8);
			arr2[i] = arr[r];
			System.out.println("change rturned by vending machine :");
			System.out.println(arr2[i]);
			
		}

		int max = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if (max < arr[i] )
				max = arr[i];
		}

	}
}

