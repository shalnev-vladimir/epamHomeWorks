package epam;

import static java.lang.System.*;

public class LengthOfTheLastWord {

    public void lengthOfLastWord(String s) {

        int n = s.trim().length();
        int result = 0;

        while (n > 0) {
            if (s.charAt(--n) != ' ') {
                result++;
            } else {
                out.println(result);
                return;
            }
        }
        out.println(result);
    }
}
