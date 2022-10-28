package Exam;

import java.util.*;

public class Q_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Random rnd = new Random();

        for(int i=1; i<=5; i++) {
            int r = rnd.nextInt(20)+1;{
                System.out.print(r+":");
                for(int j=1; j<=r; j++) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

}

