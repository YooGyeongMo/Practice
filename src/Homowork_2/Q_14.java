package Homowork_2;

import java.util.Arrays;

public class Q_14 {
        public static void main (String args[]) throws Exception {
            int array[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(array[i]);
            }
            System.out.println();
            int index = Arrays.binarySearch(array, 3);
            System.out.println("3μ μμΉ: " + index);
        }
    }


