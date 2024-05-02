import java.util.*;

public class Swimmer {  
   private String firstName, lastName;
   private int age;
   private String club;
   private float time;
   
   private int heat, lane;
//--------------------------------------
   public Swimmer(String dataline)  {
   StringTokenizer st = new StringTokenizer(dataline, " ");
   String lineNumber = st.nextToken();    //ignore and discard
   firstName = st.nextToken();
   lastName = st.nextToken();
   age = Integer.parseInt(st.nextToken().trim());
   club = st.nextToken().trim();
   
   String stime = st.nextToken().trim();
   int i = stime.indexOf(":");
   if (i > 0) {
      stime = stime.substring(0, i) + stime.substring(i+1);
   }
   time = new Float(stime).floatValue();
   
   }
   
   //-------------------------------
   public void setLane(int ln) {
      lane = ln;
   }
   //-------------------------------
   public int getLane() {
      return lane;
   }
   //-------------------------------
   public void setHeat(int ht) {
      heat = ht;
   }
   //-------------------------------
   public int getHeat() {
      return heat;
   }
   //-------------------------------
   public int getAge() {
      return age;
   }
   //-------------------------------
   public float getTime() {
      return time;
   }
   //-------------------------------
   public String getName() {
      return firstName+" "+lastName;
   }
   //-------------------------------
   public String getClub() {
      return club;
   }
}