package no.itera.fagkveld.java8.api;

public class NumberUtils {

	public static boolean isPrime(int number) {
		if (number % 2 == 0) return false;
		
		for(int i = 3; i*i <= number; i+=2) {
			if (number%i == 0) return false;
		}

		return true;
	}
	
}
