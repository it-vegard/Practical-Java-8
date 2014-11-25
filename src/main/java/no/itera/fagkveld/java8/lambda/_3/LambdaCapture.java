package no.itera.fagkveld.java8.lambda._3;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Introduce and use non-final (effectively final) state in lambda and anonymous inner class.
 * Then mutate the state of the variable.
 */
public class LambdaCapture {

    private static String staticState = "Static state";
    private String classState = "Class state";

    public void compare() {

        Optional.of(5).ifPresent(x -> {
            System.out.println("Lambda: " + classState + " in " + this + " also with " + staticState);
        });

        Optional.of(5).ifPresent(new Consumer<Integer>() {

            private String classState = "Anonymous class state";

            @Override
            public void accept(Integer x) {

                System.out.println("Anonymous inner class: " + classState + " in " + this + " also with " + staticState);
            }

        });

    }

    public static void main(String[] args) {
        new LambdaCapture().compare();
    }
}
