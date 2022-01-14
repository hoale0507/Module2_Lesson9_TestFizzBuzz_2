package com.company;

public class FizzBuzz {

    public static final String FIZZ = "FIZZ";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String BUZZ = "Buzz";

    public static String getFizz(int number) {
        boolean isDivisionByFifteen = number % 15 == 0;
        if (isDivisionByFifteen) {
            return FIZZ_BUZZ;
        }
        boolean isDivisionByThree = number % 3 == 0;
        if (isDivisionByThree) {
            return FIZZ;
        }
        boolean isDivisionByFive = number % 5 == 0;
        if (isDivisionByFive) {
            return BUZZ;
        }
        return number + "";
    }
}


