//package Lecture;
//
//import java.util.*;
//
//public class Lec_36 {
//    public static void main(String[] args) {
//
//        Random rnd = new Random();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("배열의 크기 : ");
//        int number = scanner.nextInt();
//        int[] array = new int[number];
//        int tmp = 0;
//        //난수
//
//        for (int i = 0; i < number; i++) {
//            array[i] = rnd.nextInt(101) + 1;
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        //작은수
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {ㅂ
//                if (array[i] > array[j]) {
//                    tmp = array[i];
//                    array[i] = array[j];
//                    array[j] = tmp;
//                }
//                    for (i = 0; i < number; i++) {
//                        System.out.print(array[i] + " ");
//                    }
//                    System.out.println();
//
//
//
//            }
//        }
//    }
//}
