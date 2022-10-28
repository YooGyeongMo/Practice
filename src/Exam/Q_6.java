package Exam;

import java.util.*;

public class Q_6 {
    public static void main(String[] args) {

        int user_count = 0;
        int com_count = 0;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        do {
            System.out.print("사용자 선택[1:가위,2:바위,3:보] : ");
            int i = sc.nextInt();

            int com = rnd.nextInt(1, 3);
            System.out.println("컴 : " + com);
            System.out.println("사용자 : " + i);


            if (i == 1) { //가위일 때
                if (com == 2) {
                    System.out.println("컴퓨터 승 ");
                    com_count++;
                } else if (com == 3) {
                    System.out.println("사용자 승 ! ");
                    user_count++;
                } else if (com == 1) {
                    System.out.println(" 비겼습니다. ");
//                    break;
                }

            } else if (i == 2) { // 바위 일때
                if (com == 1) {
                    System.out.println("사용자 승 ! ");
                    user_count++;
                } else if (com == 2) {
                    System.out.println("비겼습니다. 다시하세요 ");

                } else if (com == 3) {
                    System.out.println(" 컴퓨터 승 ! ");
                    com_count++;
                }
            } else if (i == 3) { //보일 때
                if (com == 1) {
                    System.out.println("컴퓨터 승 ");
                    com_count++;
                } else if (com == 2) {
                    System.out.println(" 사용자 승 ");
                    user_count++;
                } else if (com == 3) {
                    System.out.println("비겼습니다. 다시하세요.");
                }

            } else {
                System.out.println("그런 숫자는 없습니다.");

            } // if 문

        }
        while (user_count < 3 && com_count < 3);
        if (com_count == 3) {
            System.out.println("컴퓨터 승리로 게임을 종료합니다.");
        } else {
            System.out.println("사용자 승리로 게임을 종료합니다.");// while
        }
    }//메인

} //클래스

// 컨트롤 알트 L