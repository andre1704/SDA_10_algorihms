package rekurencja;

/**
 * Created by RENT on 2017-02-25.
 */
public class Recuresion {
    public static int sum(int x){
        int y=0;
        if(x>=1)
             y=x+sum(x-1);
        return y;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
