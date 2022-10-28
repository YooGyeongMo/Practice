package Lecture;

import java.util.*;

public class Lec_24 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Double [] f = new Double[5];

        for(int i = 0 ;i < f.length; i++){
            System.out.print("실수를 적으세요 : " );
            f[i] = sc.nextDouble();
        }
        for(int i = 0; i < f.length;i++){
            System.out.println( f[i] + " ");
        }

    }
}
