package Homowork_2;

import java.util.*;

public class Q_18 {
    public static void main(String[] args) {
       String [] arr_1 = { "Clubs", "Diamonds", "Hearts", "Spades" };
       String [] arr_2 = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

       Random rnd = new Random();
       Random rnd2 = new Random();
        System.out.println((arr_1[rnd.nextInt(4)])+"와" + (arr_2[rnd.nextInt(13)]) );

    }
}
