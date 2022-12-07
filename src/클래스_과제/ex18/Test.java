package 클래스_과제.ex18;

import java.util.*;

public class Test {
    //18. 사용자로부터 받은 문자열에서 자음과 모음의 개수를 계산하여서 출력하는 프로그램을 작성하라.
    public static void main(String[] args) {

        int count1=0;
        int count2=0;
        char s1;
        System.out.println("문자열 입력 : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            s1 = str.charAt(i);

            if(s1 == 'a'|| s1 == 'e' || s1 ==  'i' || s1 == 'u' || s1 == 'o' || s1 == 'A' || s1 == 'E' || s1 == 'I' ||
                    s1 == 'O' || s1 == 'U'){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println("\n자음의 개수 " + count1 +"개 \n" + "모음의 개수 " + count2 +" 개");
    }
}
