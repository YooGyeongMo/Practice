package Lecture;

import java.util.*;

public class Lec_34 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[][] num = new int[3][5];
        int[] row = new int[3];
        int[] col = new int[5];
        int[] sort = new int[3 * 5];
        //난수생성
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++){
                num[i][j] = rnd.nextInt(101);
                sort[i * 5 + j] = num[i][j];
        }
    }
        Arrays.sort(sort);
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length;j++)
                num[i][j] = sort[i*5+j];
        }
        for(int i =0; i<num.length; i++){
            for(int j =0; j<num[i].length;j++){
                System.out.printf("%4d", num[i][j]);
                row[i] += num[i][j];
                col[j] += num[i][j];

            }
            System.out.println("("+ row[i] +") ");
        }
        for(int data : col){
            System.out.print("(" + data + ")");
        }
    }
}
