package Lecture;

import java.util.*;

public class Lec_35 {
    public static void main(String[] args) {

        int [][] arr = new int[5][10];
        int[] row = new int[3];
        int[] col = new int[10];
        int gob = 0;

        for(int i = 2; i <=4;i++){
            System.out.println(i+"단");

            for(int j =1; j<10;j++ ){
                arr[i][j] = i*j;

                System.out.print(i+ "x" + j + "=" + arr[i][j] + "//");

                if (j==9){
                    System.out.println();
                }
            }
        }
    }
}
