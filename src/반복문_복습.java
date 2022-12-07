import java.util.*;
public class 반복문_복습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int time = 0;
        int after = 0;
        System.out.println("번호를 입력 : ");
        num = sc.nextInt();
        System.out.println("시간을 입력 : ");
        time = sc.nextInt();


            if(1 <= num && num <= 10) {
            if (1 <= time && time <= 15) {
                after = (int)Math.pow(num,time);

                System.out.println(num + " 은  세균 증식이 "+ time + "시간 후에 " + (after) + "마리가 된다.");
            }
            else{
                System.out.println("다시하시오");
            }
        }

        else{
            System.out.println("다시하시오.");
        }
    }
}
