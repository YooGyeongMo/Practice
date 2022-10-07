package Homework;

import java.util.*;

public class Q_01 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int count = sc.nextInt();
        if(count>=20 && count<60) {
            count++;
            System.out.println("20이상 60미만인 정수입니다. count에 축적되었습니다.");
        }
        else{
            System.out.println("조건에 해당하는 정수가 아닙니다.");
            }
        }
    }

