package Lecture;

import java.util.*;

public class Lec_17 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        for(int k = 1; k<7; k++){

            int num = rnd.nextInt(45) + 1;
            System.out.print("LOTTO : " + num + " ");
        }
    }
}
