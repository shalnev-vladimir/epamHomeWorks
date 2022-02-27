package epam;

import java.util.Arrays;

import static java.lang.System.*;

class SquareRootEpam {

    public void squareRoot(int n) {

        if (n < 2) {
            out.println(n);
        }
        long num;
        int pivot;
        int left = 2;
        int right = n / 2;

        while (left <= right) {
            pivot = left + (right - left) / 2;
            num = (long)pivot * pivot;
            if (num > n) {
                right = pivot - 1;
            } else if (num < n) {
                left = pivot + 1;
            } else out.println(pivot);
        }
        out.println(right);
    }
}
