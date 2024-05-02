public class PrelimEvent extends Event {

//class describes an event that will be swum twice
    public PrelimEvent(String filename, int lanes) {
        super(filename, lanes);
    }
    //return circle seeding
    public  Seeding getSeeding() {
        return new CircleSeeding(swimmers, numLanes);
    }
    public boolean isPrelim() {
        return true;
    }
    public boolean isFinal() {
        return false;
    }
    public boolean isTimedFinal() {
        return false;
    }

}
