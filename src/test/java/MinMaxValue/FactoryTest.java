package MinMaxValue;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {

    private Factory factory = new Factory();

    @Test
    public void shouldProduceMin() {

//        given
        final MinMaxValueType type = MinMaxValueType.MIN;

//        when

        MinMaxValueInterface result = factory.produce(type);

//        then
        assertTrue(result instanceof MinMaxValueInterface);
        assertTrue(result instanceof MinValue);
        assertFalse(result instanceof MaxValue);

    }
}