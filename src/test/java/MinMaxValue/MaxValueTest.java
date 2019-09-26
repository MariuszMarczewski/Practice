package MinMaxValue;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueTest {

    private MinMaxValueInterface fibonacci = new MaxValue();

    @Test
    public void shouldReturn6WhenNumbersGiven() {

//        given
        final int[] numbers = {2, 4, 6};
        final int expectedValue = 6;

//        when
        MaxValue test = new MaxValue();

        int result = test.getN(numbers);

//        then
        assertEquals(expectedValue, result);
    }
}
