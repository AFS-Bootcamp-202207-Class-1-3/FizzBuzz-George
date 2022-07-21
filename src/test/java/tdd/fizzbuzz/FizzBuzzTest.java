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
}
