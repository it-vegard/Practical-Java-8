package no.itera.fagkveld.java8;

import no.itera.fagkveld.java8.tasks.Task1;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class Task1Test {

    @Test
    public void testGetPrimesAsArray() {
        assertThat(Task1.getPrimesAsArray(0, 50),
                contains(1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47));
    }

    @Test
    public void testGetIntegersDivisibleBy() {
        assertThat(Task1.getIntegersDivisableBy(4, 50),
                contains(0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48));
    }

    @Test
    public void testGetMultiplesOfPi() {
        assertThat(Task1.getMultiplesOfPi(0, 5),
                contains(0.0, 3.141592653589793, 6.283185307179586, 9.42477796076938, 12.566370614359172, 15.707963267948966));
    }
}
