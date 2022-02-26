package epam;

import static java.lang.System.*;

class FizzBuzzEpam {

    public void fizzBuzz(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            out.println("fizzbuzz");
        } else if (n % 3 == 0) {
            out.println("fizz");
        } else {
            out.println("buzz");
        }
    }

}
