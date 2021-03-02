public class Temperature{

	public static double celsiusToFahrenheit(double celsius){
		double fahrenheit = (9.0/5.0 * celsius + 32.0); 
		return fahrenheit;
	}
	public static double celsiusToKelvin(double celsius){
		double kelvin = celsius + 273.15;
		return kelvin; 
	}
	public static double fahrenheitToCelsius(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5.0/9.0;
		return celsius; 
	}
	public static double fahrenheitToKelvin(double fahrenheit){
		double kelvin = (fahrenheit + 459.67) * (5.0/9.0);
		return kelvin;
	}
	public static double kelvinToFahrenheit(double kelvin){
		double fahrenheit = (9.0/5.0 * kelvin - 459.67);
		return fahrenheit;
	}
	public static double kelvinToCelsius(double kelvin){
		double celsius = kelvin - 273.15;
		return celsius;
	}
}