package epam;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        PalindromeNumberEpamHomeWork palindromeNumberEpamHomeWork = new PalindromeNumberEpamHomeWork();
        palindromeNumberEpamHomeWork.isPalindrome(121);

        FizzBuzzEpam fizzBuzzEpam = new FizzBuzzEpam();
        fizzBuzzEpam.fizzBuzz(10);

        SquareRootEpam squareRootEpam = new SquareRootEpam();
        squareRootEpam.squareRoot(10);

        LengthOfTheLastWord lengthOfTheLastWord = new LengthOfTheLastWord();
        lengthOfTheLastWord.lengthOfLastWord("Hello word");

        DivideWithoutDividerEpam divideWithoutDividerEpam = new DivideWithoutDividerEpam();
        divideWithoutDividerEpam.divideWithoutDivider();

        Fibonacci fibonacci = new Fibonacci();
        out.println(fibonacci.fibonacciRecursive(11));
    }

}
