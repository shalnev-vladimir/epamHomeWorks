package epam;

import static java.lang.System.*;

class SquareRootEpam {

    public void squareRoot(int n) {

        int temp;
        int squareRoot = n / 2;

        do {
            temp = squareRoot;
            squareRoot = (temp + (n / temp)) / 2;
        } while ((temp - squareRoot) != 0);
        out.println("Square root of the number is: " + squareRoot);
    }
}
