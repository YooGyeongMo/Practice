import java.util.*;

public class Homework02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("달러 환율 입력: ");
        int dollar = sc.nextInt();
        System.out.print("환전할 금액(원): ");
        int won = sc.nextInt();

        double exchange = (double) won / dollar;
        System.out.println(won + "원은 " + String.format("%.2f",exchange) + "달러 입니다." );

    }
}
