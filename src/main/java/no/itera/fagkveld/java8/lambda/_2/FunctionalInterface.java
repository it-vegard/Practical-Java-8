package no.itera.fagkveld.java8.lambda._2;

import java.util.function.BiFunction;

/**
 * Replace built-in functional interface with your own without generics. Introduce an exception to the method signature.
 */
public class FunctionalInterface {

    public static void encode(BiFunction<String, String, String> encoder) {
        String encoded = encoder.apply("abc", "123");
        System.out.println(encoded);
    }

    public static void main(String[] args) {
        encode((s1, s2) -> s1 + s2);
    }
}
