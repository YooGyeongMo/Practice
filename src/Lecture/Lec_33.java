//package Lecture;
//
//import java.util.*;
//
//public class Lec_33 {
//    public static void main(String[] args) {
//        Random rnd = new Random();
//        int[] num = new int[10];
//
//        int[] dec = new int[10];
//
//        int i, j, min, tmp;
//
//        for (i = 0; i < 10; i++) {
//            num[i] = rnd.nextInt(101);
//            int[] anc = Arrays.copyOf(num, num.length);
//            Arrays.sort(anc);
//
//        for(i = 0; i<10; i++)
//            dec[10 - i - 1] = anc[i];
//        }
//
//        System.out.println();
//        for(i =0; i< 10; i++)
//            System.out.print(num[i] + " ");
//        System.out.println();
//        for(i =0; i< 10; i++)
//            System.out.print(anc[i] + " ");
//        System.out.println();
//        for(i =0; i< 10; i++)
//            System.out.print(dec[i] + " ");
//        }
//    }
//
//
//
