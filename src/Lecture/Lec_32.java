package Lecture;

import java.util.*;

public class Lec_32 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] num = new int[10];
        int tmp;
        int i;
        int j;
        int min;
        for(i =0 ; i<10;i++)
            num[i] = rnd.nextInt(101);
        for(i=0; i< 10; i++)
            System.out.print(num[i] + "  ");
        Arrays.sort(num);
        /*for(i=0; i<10;i++){
            min = i;
            for(j= i+1; j <10; j++){
                if(num[min] > num[j])
                    min = j;
            }
            tmp = num[min];
            num[min] = num[i];
            num[i] = tmp;
        }*/
        System.out.println();
        for(i=0;i<10;i++)
            System.out.print(num[i] + " ");
    }
}
