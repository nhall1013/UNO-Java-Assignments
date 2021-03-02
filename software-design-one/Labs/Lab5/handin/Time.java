public class Time{
	
	public static double secondsToMinutes(int seconds){
		double minutes = (double) seconds / 60;
		return minutes;
	}
	public static double secondsToHours(int seconds){
		double minutes = (double) seconds / 60;
		double hours = minutes / 60;
		return hours;
	}
	public static double secondsToDays(int seconds){
		double minutes = (double) seconds / 60;
		double hours = minutes / 60; 
		double days = hours / 24;
		return days;
	}
	public static double secondsToYears(int seconds){
		double minutes = (double) seconds / 60;
		double hours = minutes / 60;
		double days = hours / 24;
		double years = days / 365;
		return years; 
	}
	public static double minutesToSeconds(double minutes){
		double seconds = minutes * 60;
		return seconds; 
	}
	public static double hoursToSeconds(double hours){
		double seconds = hours *3600; 
		return seconds; 
	}
	public static double daysToSeconds(double days){
		double seconds = days * 86400;
		return seconds; 
	}
	public static double yearsToSeconds(double years){
		double seconds = years * 31536000;
		return seconds; 
	}
}