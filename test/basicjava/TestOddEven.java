package basicjava;

import org.junit.Assert;
import org.junit.Test;

public class TestOddEven {
    @Test
    public void testIsOdd(){
        Assert.assertEquals(false, OddEven.isOdd(4));
    }

    @Test
    public void testIsNegativeOdd(){
        Assert.assertEquals(true, OddEven.isOdd(-3));
    }
}
