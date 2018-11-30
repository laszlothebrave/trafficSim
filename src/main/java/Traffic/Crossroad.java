package Traffic;

import java.util.ArrayList;

class Crossroad implements Node{
    ArrayList<Line> lines;

    public Crossroad() {
       lines = new ArrayList<>();
    }
}
