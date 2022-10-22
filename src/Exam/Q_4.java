package Exam;

import java.util.*;

public class Q_4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int money = 10000;
        int save = 0;
        int with = 0;

    while(true){
        System.out.println("======은행업무======");
        System.out.println("1.저축  2.인출");
        System.out.println("3.잔액  4.프로그램종료");
        System.out.print("메뉴 선택 : \n");
        int a = sc.nextInt();

        if(a==1) {
            System.out.println("저축할 금액: ");
            save = sc.nextInt();
            money = money + save;
            System.out.println(money + "원이 저축 되었습니다.");
        }

        else if(a==2)
        {
            System.out.println("인출할 금액: ");
            with = sc.nextInt();


            if (with <= 0) {
                System.out.println("인출 할 금액을 다시 입력하세요.");

            }
            else if (money == 0) {
                System.out.println("잔액이 없습니다.");

            }
            else if (money-with < 0){
                System.out.println("잔액이 부족합니다.");
            }
            else {

                System.out.println(with + "원이 인출되었습니다.");
                money = money - with;
            }

        }
        else if(a==3) {
            if (money > 0 ) {
                System.out.println("총 금액 = " + money + "입니다. ");
            }
            else if ( money == 0 ){
                System.out.println("금액이 0원 입니다. ");
            }
            else if (money < 0) {
                System.out.println("인출할 금액이 없습니다.");
            }
        }
        else if(a==4){
            System.out.println("프로그램을 종료합니다.");
            break;
        }




    }
    }
}
