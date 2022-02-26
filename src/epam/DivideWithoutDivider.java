package epam;

import static java.lang.System.*;

class DivideWithoutDividerEpam {

    public void divideWithoutDivider() {
        int x = 9;
        int y = 3;
        int div = 0;
        while (x >= y) {
            x -= y;
            div++;
        }
        out.println(div);
    }

}
