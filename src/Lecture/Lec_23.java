package Lecture;

import java.util.*;

public class Lec_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] toppings = new String[5];
        for (int i = 0; i < toppings.length; i++) {
            System.out.println((i+1) + "번 말 : ");
            toppings[i] = sc.nextLine();

        }
        for (int i = 0; i < toppings.length; i++) {
            System.out.print(toppings[i] + " ");
        }

    }
}
