import java.util.*;

public abstract class Event {
    protected int numLanes;
    protected Vector swimmers;

    public Event(String filename, int lanes) {
        numLanes = lanes;
        swimmers = new Vector();
        //read in swimmers from file
        InputFile f = new InputFile(filename);
        String s = f.readLine();
        while (s != null) {
            Swimmer sw = new Swimmer(s);
            swimmers.addElement(sw);
            s = f.readLine();
        }
        f.close();
    }
    public abstract Seeding getSeeding();
    public abstract boolean isPrelim();
    public abstract boolean isFinal();
    public abstract boolean isTimedFinal();
}
