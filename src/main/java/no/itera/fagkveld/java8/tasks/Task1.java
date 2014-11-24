package no.itera.fagkveld.java8.tasks;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import no.itera.fagkveld.java8.api.NumberUtils;

public class Task1 {
	
	/*
	 * Use streams to create an array of integers divisible
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
	
	public static void main(String[] args) {
		System.out.println("Starting program");
//		int[] primes = getPrimesAsArray(0, 100);
//		for(int i : primes) System.out.println(i);
		
//		int[] divisibleByThree = getIntegersDivisableBy(4, 50);
//		for(int i : divisibleByThree) System.out.println(i);
		
		double[] multiplesOfPi = getMultiplesOfPi(0, 5);
		for(double i : multiplesOfPi) System.out.println(i);
	}
	
}
