package Lecture;

import java.util.*;

public class Lec_28 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int i,j ;
        int [ ] s = new int[100];
        int [ ] count = new int[7];

        for (i = 0; i < 100; i++){
            s[i] = rnd.nextInt(6)+1;
        }
        for(i = 1 ; i < 7; i++){
            count[i] = 0;
        }
        for (i=0 ; i <100; i++){
            count[s[i]]++;
        }
        for (i = 1; i < 7; i++) { // 0 안 쓰고 1~7
            System.out.print( i + " 의 개수 :  " + count[i] + "별의 개수 : ");
            for(j =1 ; j < count[s[i]] ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
