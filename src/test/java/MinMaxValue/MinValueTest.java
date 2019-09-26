package MinMaxValue;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinValueTest {

    @Test
    public void shouldReturn2WhenNumbersGiven() {

//        given
        final int[] numbers = {2, 4, 6};
        final int expectedValue = 2;

//        when
        MinValue test = new MinValue();

        int result = test.getN(numbers);

//        then
        assertEquals(expectedValue, result);
    }
}