package Traffic;

import java.util.ArrayList;
import java.util.LinkedList;

class Line {
    ArrayList<LinePoint> linePoints;
    LinkedList<Node> nodes;
    ArrayList<SpeedLimit> speedLimits;
    ArrayList<LineChangeRestriction> lineChangeRestrictionsLeft;
    ArrayList<LineChangeRestriction> lineChangeRestrictionsRight;

    Line() {
        linePoints = new ArrayList<>();
        nodes = new LinkedList<>();
        speedLimits = new ArrayList<>();
        lineChangeRestrictionsLeft = new ArrayList<>();
        lineChangeRestrictionsRight = new ArrayList<>();
    }

    Integer allowedSpeed(Integer carPosition){
        return 50;
    }

    boolean isLineChangeLeftAllowed(Integer carPosition){
        return false;
    }

    boolean isLineChangeRightAllowed(Integer carPosition){
        return false;
    }
}
