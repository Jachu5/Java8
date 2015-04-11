import org.junit.Assert;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @org.junit.Test
    public void testFizzBuzzTraditional() throws Exception {
        // easy
        Assert.assertEquals(FizzBuzz.FIZZ,FizzBuzz.fizzBuzzTraditional(3));
        Assert.assertEquals(FizzBuzz.BUZZ,FizzBuzz.fizzBuzzTraditional(5));
        Assert.assertEquals(FizzBuzz.FIZZ+FizzBuzz.BUZZ,FizzBuzz.fizzBuzzTraditional(15));

         // hell
        Assert.assertEquals(FizzBuzz.FIZZ,FizzBuzz.fizzBuzzTraditional(9));
        Assert.assertEquals(FizzBuzz.BUZZ,FizzBuzz.fizzBuzzTraditional(25));
        Assert.assertEquals(FizzBuzz.FIZZ+FizzBuzz.BUZZ,FizzBuzz.fizzBuzzTraditional(45));

        Assert.assertEquals("23",FizzBuzz.fizzBuzzTraditional(23));


    }

    @org.junit.Test
    public void testFizzBUzzJava8() throws Exception {
        // easy
        Assert.assertEquals(FizzBuzz.FIZZ,FizzBuzz.fizzBUzzJava8(3));
        Assert.assertEquals(FizzBuzz.BUZZ,FizzBuzz.fizzBUzzJava8(5));
        Assert.assertEquals(FizzBuzz.FIZZ+FizzBuzz.BUZZ,FizzBuzz.fizzBUzzJava8(15));

        // hell
        Assert.assertEquals(FizzBuzz.FIZZ,FizzBuzz.fizzBUzzJava8(9));
        Assert.assertEquals(FizzBuzz.BUZZ,FizzBuzz.fizzBUzzJava8(25));
        Assert.assertEquals(FizzBuzz.FIZZ+FizzBuzz.BUZZ,FizzBuzz.fizzBUzzJava8(45));

        Assert.assertEquals("23",FizzBuzz.fizzBUzzJava8(23));
    }

    @org.junit.Test
    public void testFizzBuzzJava8RegularPeople() throws Exception {
        // easy
        Assert.assertEquals(FizzBuzz.FIZZ,FizzBuzz.fizzBuzzJava8RegularPeople(3));
        Assert.assertEquals(FizzBuzz.BUZZ,FizzBuzz.fizzBuzzJava8RegularPeople(5));
        Assert.assertEquals(FizzBuzz.FIZZ+FizzBuzz.BUZZ,FizzBuzz.fizzBuzzJava8RegularPeople(15));

        // hell
        Assert.assertEquals(FizzBuzz.FIZZ,FizzBuzz.fizzBuzzJava8RegularPeople(9));
        Assert.assertEquals(FizzBuzz.BUZZ,FizzBuzz.fizzBuzzJava8RegularPeople(25));
        Assert.assertEquals(FizzBuzz.FIZZ+FizzBuzz.BUZZ,FizzBuzz.fizzBuzzJava8RegularPeople(45));

        Assert.assertEquals("23",FizzBuzz.fizzBuzzJava8RegularPeople(23));
    }
}