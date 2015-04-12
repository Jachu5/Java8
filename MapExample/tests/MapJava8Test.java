import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MapJava8Test {

    Integer[] numbers = new Integer[]{1,2,10,5,6};
    String[] letters = new String[]{"a","b","c","ab","cb"};


    @org.junit.Test
    public void testPowerTest() throws Exception {
        Assert.assertEquals(Arrays.asList(1,4,100,25,36),MapJava8.powerTest(numbers));
    }

    @Test
    public void testUpperCaseTest() throws Exception {
        Assert.assertEquals(Arrays.asList("A","B","C","AB","CB"),MapJava8.toUpperCase(Arrays.asList(letters)));
    }
}

