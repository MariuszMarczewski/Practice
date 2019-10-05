package MorseCoder;


import org.junit.Test;

import static org.junit.Assert.*;

public class CoderFactoryTest {

    private CoderFactory factory = new CoderFactory();

    @Test
    public void shouldProduceMorse(){
    //        given

    final CoderType type = CoderType.MORSE;

//        when

    Coder result = factory.produce(type);

    //        then
    assertTrue(result instanceof Coder);
    assertTrue(result instanceof MorseCoder);
    assertFalse(result instanceof ICAOCoder);

}
}
