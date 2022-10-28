package Exam;

import java.util.Random;

public class Q_1 {
    public static void main(String[] args) {


        Random rnd = new Random();
        int x, y, z, num;

        System.out.print("화성가자:");

        for (int k = 1; k <= 10; k++) {
            num = rnd.nextInt(100);
            System.out.print(" " + num);
        }
    }
}



