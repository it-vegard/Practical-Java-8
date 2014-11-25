package no.itera.fagkveld.java8.tasks.solution;

import java.util.ArrayList;
import java.util.stream.IntStream;

import no.itera.fagkveld.java8.api.NumberUtils;

public class Task1 {
	
	/*
	 * Use streams to create an array of integers divisible by the divider param, up to and including the max param.
	 * 
	 */
	public static int[] getIntegersDivisableBy(int divider, int max) {
		return IntStream.range(0, max+1)
				.filter(i -> i % divider == 0)
				.toArray();
	}
	
	/*
	 * Use streams to create an array of prime numbers in the range of startIndex to endIndex.
	 * 
	 * Hint: Use NumberUtils.isPrime to determine whether an integer is a prime number.
	 */
	public static int[] getPrimesAsArray(int min, int max) {
		return IntStream.range(min, max+1)
					.filter(i -> NumberUtils.isPrime(i))
					.toArray();
	}
	
	/*
	 * Use streams to create an array of multiples of PI
	 * Formula: x = n * Math.PI
	 */
	public static double[] getMultiplesOfPi(int min, int max) {
		return IntStream.range(min, max+1)
				.mapToDouble(d -> d)
				.map(d -> d*Math.PI)
				.toArray();
	}
	
}
