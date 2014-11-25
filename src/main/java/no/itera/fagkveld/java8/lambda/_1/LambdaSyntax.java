package no.itera.fagkveld.java8.lambda._1;

import java.util.Optional;
import java.util.function.Function;

/**
 * Try replacing lambda with anonymous inner class, skipping the intermediate "increment" variable",
 * converting to one-line lambda and writing the lambda from scratch.
 */
public class LambdaSyntax {
    public static void main(String[] args) {

        Function<Integer, Integer> increment = (Integer x) -> {
            Integer y = x + 1;
            return y;
        };

        Optional<Integer> original = Optional.of(5);
        Optional<Integer> incremented = original.map(increment);
        System.out.println(incremented.get());

    }
}
