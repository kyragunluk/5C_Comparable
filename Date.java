/**
  Represent a date
 */
public class Date implements Comparable {
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // someday: ISO 8601
        return y + "-" + m + "-" + d;
    }

    public int compareTo( Object otherObj){
        Date date = (Date) otherObj;
        int days1 = y*365+m*30+d;
        int days2 = date.y*365+date.m*30+date.d;
        return days1-days2;
    }




}
