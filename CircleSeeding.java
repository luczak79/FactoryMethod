import java.util.*;

public class CircleSeeding extends StraightSeeding {

    public CircleSeeding(Vector sw, int lanes) {
        super(sw, lanes); //straight seed first
        seed();
    }
//----------------------------
    protected void seed() {
        int circle; 

        super.seed();        //do straight seed as default
        if (numHeats >= 2 ) {
            if (numHeats >= 3)
                circle = 3;
            else
                circle = 2; 
            int i = 0;
            for (int j = 0; j < numLanes; j++) {
                for (int k = 0; k < circle; k++) {
                    swmrs[i].setLane(lanes[j]);
                    swmrs[i++].setHeat(numHeats - k);
                }
            }
        }
    }
}

