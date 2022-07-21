package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_countOff_given_1() {

        //given
        int number = 1;
        String expectedResult = "1";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(number);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_Fizz_when_countOff_given_3() {
        //given
        int number = 3;
        String expectedResult = "Fizz";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(number);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_Buzz_when_countOff_given_5() {
        //given
        int number = 5;
        String expectedResult = "Buzz";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(number);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_Whizz_when_countOff_given_7() {
        //given
        int number = 7;
        String expectedResult = "Whizz";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(number);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_FizzBuzz_when_countOff_given_15() {
        //given
        int number = 15;
        String expectedResult = "FizzBuzz";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(number);

        //then
        assertEquals(expectedResult, result);
    }

}
