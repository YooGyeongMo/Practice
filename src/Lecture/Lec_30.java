package Lecture;

import java.util.*;

public class Lec_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        System.out.print(" 완전수 출력 :  ");
        //num = sc.nextInt();
        for(num = 1; num<= 10000; num ++){
            sum=0;
            for(int i =1;i<num; i++) {
                if (num % i == 0) {
                   // System.out.print(i + " ");
                    sum += i;
                }
            }
                 if (sum == num) ;
                     System.out.println(num + "  ");
                }
            }
        }
