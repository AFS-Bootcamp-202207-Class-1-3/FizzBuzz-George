package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number) {
        String result = "";
        if (number % 3 == 0) {
            result =  "Fizz";
        } else if (number % 5 == 0){
            result = "Buzz";
        }
        return result.length() == 0 ? String.valueOf(number) : result;
    }
}
