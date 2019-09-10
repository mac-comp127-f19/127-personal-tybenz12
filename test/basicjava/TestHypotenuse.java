package basicjava;

import basicjava.Hypotenuse;
import org.junit.Assert;
import org.junit.Test;

public class TestHypotenuse {
    @Test
    public void testHypotenuse(){
        Assert.assertEquals(5.0, Hypotenuse.calculateHypotenuse(3.0, 4.0),0001);
    }
}
