package pl.javaand.train.javand2.algorithms;

/**
 * Created by RENT on 2017-03-02.
 */
public class MathOperation {

    public static double podzial(double x, double y) {
        if(y==0){
            throw new IllegalArgumentException("Could not divide by zero");
        }
        return x / y;
    }
    public static int factorial(int x){
        int y=1;
        if(x>=13||x<0){
            throw new IllegalArgumentException();
        }
        for(int i=1;i<=x;i++){
            y=y*i;
        }
        return y;
    }


}
