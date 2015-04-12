import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MapJava8Test {

    Integer[] numbers = new Integer[]{1,2,10,5,6};


    @org.junit.Test
    public void testPowerTest() throws Exception {
        Assert.assertEquals(Arrays.asList(1,4,100,25,36),MapJava8.powerTest(numbers));
    }
}