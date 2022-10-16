package Homework;

import java.util.*;

public class Q_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("정수입력 : ");
            int x = sc.nextInt();
            System.out.println("2정수입력 : ");
            int y = sc.nextInt();
            System.out.println("3정수 입력: ");
            int z = sc.nextInt();


            if(x < y && x < z) {
                System.out.println(" 가장 작은 정수 : " + x + "입니다.");
            }
            else if (y < x && y < z){
                System.out.println(" 가장 작은 정수 : "+ y + "입니다.");
            }
            else if (z < x && z < y){
                System.out.println("가장 작은 정수 : " + z + "입니다.");
            }

        }
    }
}
