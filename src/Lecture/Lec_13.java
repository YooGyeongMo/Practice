package Lecture;

import java.util.*;

public class Lec_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("값: ");
        int j = sc.nextInt();

        int sum = 0;

        for(int i=0; i <= j; i++){

            sum += i;
        }
        System.out.print(sum);
    }
}
