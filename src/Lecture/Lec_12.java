package Lecture;

import java.util.*;
//100 이상의 정수중 짝수만 사용자 입력한 개수만큼 출력하세요.
public class Lec_12 {
    public static void main(String [] args){
        System.out.print("출력할 갯수 입력 : ");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int i = 100;
        while( i >= 100){
             i+=2;
             System.out.println(i);
                j--;
                if(j==0){
                    break;
                }
            }
        }
    }

