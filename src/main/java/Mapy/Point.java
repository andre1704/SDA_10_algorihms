package Mapy;

/**
 * Created by RENT on 2017-03-21.
 */
public class Point implements Comparable {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "x "+x+" "+"y "+y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {}
    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        if (o != null) {
            if (o instanceof Point) {
                Point p = (Point) o;
                if (x > p.getX()) {
                    return 1;
                } else if (x == p.getX()) {
                    if(y>p.getY())
                    return 1;
                    else if(y==p.getY())
                        return 0;
                    else
                        return -1;
                } else {
                    return -1;
                }
            }

        }

        return 0;
    }
}
