package 클래스_과제.ex19;

import java.util.*;

public class 문자열_아이디확인 {
//    19. 사용자로부터 아이디를 받아서 미리 저장된 아이디와 일치하는지를 검사하는 프로그램을 작성하여 보자.
public static void main(String[] args) {
    String str;
    String id = "Ianka123";

    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();

    if(str.equals(id)) { //eqauls()함수는 대소문자 구별 equalsIgnoreCase() 함수는 대소문자 구별 X

        System.out.println("로그인 아이디가 동일합니다.");
    }
    else{
        System.out.println("로그인 아이디가 다릅니다.");

    }
}
}
