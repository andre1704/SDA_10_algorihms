package rekurencja;

/**
 * Created by RENT on 2017-02-25.
 */
public class Nwd {
    public static int nwd(int k, int n){
        if(k>0){
            return nwd(n%k,k);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(nwd(12,18));
    }
}
