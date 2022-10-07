package Homework;

import java.util.*;

public class Q_01_3 {
    public static void main(String [] args){
       //(3) x가 1부터 20 사이에 있으면 x의 값을 y에 대입한다.
        Scanner sc = new Scanner(System.in);
        System.out.print("x 값을 입력하세요: ");
        int x = sc.nextInt();
        int y;

        if (x >= 1 && x <= 20){
            System.out.println("x 값이 1부터 20 사이에 있습니다. 그리고 y값에 대입합니다. ");
            y = x;
        }
        else {
            System.out.println("조건에 맞지않습니다.");
        }
    } //end of main
} // end of class
