package Lecture;

import java.util.*;

public class Lec_25 {
    public static void main(String [] args){
        String [] name = {"홍길동", "유관순", "이승엽", "가나다", "이승만"};
        Scanner sc = new Scanner(System.in);
        int i;
        String search;

        for(i=0; i<5; i++){
            System.out.print(name[i] + "  ");

        }

        System.out.print("찾을 사람 이름 : ");
            search = sc.next();
        for(i =0; i <5; i++){
            if(name[i] == search) {
                // == 과 같은 의미 .equals()

                break;
            }
        }

        if (i < 5) {
            System.out.println(search + "는 " + ( i+1 ) + "번째 사람입니다." );
        }
        else{
            System.out.println("그런사람 없습니다. ");
        }
    }
}
