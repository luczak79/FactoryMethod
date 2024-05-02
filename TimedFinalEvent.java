
public class TimedFinalEvent extends Event {

    //class describes an event that will be swum twice
    public TimedFinalEvent(String filename, int lanes) {
        super(filename, lanes);
    }
    //return StraightSeeding class
    public  Seeding getSeeding() {
        return new StraightSeeding(swimmers, numLanes);
    }
    public boolean isPrelim() {
        return false;
    }
    public boolean isFinal() {
        return false;
    }
    public boolean isTimedFinal() {
        return true;
    }

}
