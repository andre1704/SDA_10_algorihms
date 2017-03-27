package threadsexercise.macierzethreads;

import java.util.Random;

/**
 * Created by RENT on 2017-03-18.
 */
public class MatrixThread extends Thread {
    MaThread[] matrixThreads;

    @Override
    public void run() {
        int[][] arrayA = new int[10][10];
        int[][] arrayB = new int[10][10];
        Random random = new Random();
        fillArray(arrayA, random, 6);
        fillArray(arrayB, random, 7);

        int[][] result = new int[arrayB.length][arrayA[0].length];
        matrixThreads = new MaThread[4];
        for (int i = 0; i < matrixThreads.length; i++) {
            int pom=result.length/4;
            int x=i*pom;
            int y=(i+1)*pom;

            matrixThreads[i] = new MaThread(x, y, arrayA, arrayB, result);
            matrixThreads[i].start();
        }
        for (int i = 0; i < matrixThreads.length; i++) {
            try {
                matrixThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        writeTable(arrayA);
        System.out.println();
        writeTable(arrayB);
        System.out.println();
        writeTable(result);
    }

    public void writeTable(int[][] result) {
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(" "+result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void fillArray(int[][] arrayA, Random random, int bound) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[0].length; j++) {
                arrayA[i][j] = random.nextInt(bound);
            }
        }
    }

    public static void main(String[] args) {
        MatrixThread ma=new MatrixThread();
        ma.start();
    }
}