package HrabiaVonPesel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckYourPeselTest {

    @Test
    public void shouldReturnCorrectPeselNumber() {

//        given

String PESEL = "74011708237";

boolean expected = true;

//        when

boolean result = CheckYourPesel.check(PESEL);

//        then

        Assert.assertEquals(expected, result);

    }
}