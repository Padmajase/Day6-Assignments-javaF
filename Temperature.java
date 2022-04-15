import java.util.Scanner;

class Temperature{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 1 for farenheit or 2 for ceclius  conversion :");
		int option = sc.nextInt();
		Util.temperatureConversion(option);
		
	}
}

class Util {
	
	static void temperatureConversion(int option)
	{
		
		Scanner sc = new Scanner (System.in);
		if (option == 1){
			System.out.println("Enter the temperature in  °C : ");
			float cTemp = sc.nextFloat();           
			float CelsiusToFahrenheit = (cTemp * 9/5) + 32;
			System.out.println(cTemp+ "°C = " +CelsiusToFahrenheit + "°F" );
			
			 }
		else if (option == 2){
			System.out.println("Enter the temperature in  °F : ");
			float fTemp = sc.nextFloat();                   
			float FahrenheitToCelsius = (fTemp - 32) * 5/9 ;
			System.out.println(fTemp +"°F  = " +FahrenheitToCelsius + "°C");
		}	
	}
}