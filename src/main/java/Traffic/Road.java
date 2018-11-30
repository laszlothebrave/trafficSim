package Traffic;

import java.util.ArrayList;

class Road {
    ArrayList<Line> firstDirection;
    ArrayList<Line> secondDirection;

    Road() {
        firstDirection = new ArrayList<>();
        secondDirection = new ArrayList<>();
    }
}
