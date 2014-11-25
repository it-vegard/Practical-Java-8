package no.itera.fagkveld.java8.lambda._4;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Convert to method refs.
 */
public class LambdaMethodRef {
    public static void main(String[] args) {

        Consumer<Double> printer = x -> System.out.println(x);
        Function<Integer, Double> doubleTransformer = x -> x.doubleValue();
        Double doubleValue = doubleTransformer.apply(5);
        printer.accept(doubleValue);
    }
}
