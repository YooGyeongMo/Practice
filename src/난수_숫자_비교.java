//import java.util.*;
//
//public class 난수_숫자_비교 {
//    public static void main(String[] args) {
//
//        int strike = 0;
//        int ball = 0;
//        int count = 0;
//        Scanner sc = new Scanner(System.in);
//        Random rnd = new Random();
//
//        int i = rnd.nextInt(886) + 102;
//        int a1 = i % 100 / 10; // 1의 자리
//        int a2 = i % 1000 / 100; //10의 자리
//        int a3 = i % 10000 / 1000; // 100의자리
//
//        System.out.print("3자리 입력하세요 : ");
//        int j = sc.nextInt();
//
//        int b1 = j % 100 / 10; // 1의 자리
//        int b2 = j % 1000 / 100; //10의 자리
//        int b3 = j % 10000 / 1000; // 100의자리
//
//        for (; ; ) {
//            if (a1 == a2 || a2 == a3 || a1 == a3)
//                continue;
//            else
//                break;
//        }
//
//        do {
//            for (; ; ) {
//                if (b1 == b2 || b2 == b3 || b1 == b3)
//                    continue;
//                else
//                    break;
//            }
//
//            if (a1 == b1) {
//                strike++;
//                count++;
//            } else if (a1 == b2 || a1 == b3) {
//
//                ball++;
//                count++;
//            }
//            if (a2 == b2) {
//                strike++;
//                count++;
//            } else if (a2 == b1 || a2 == b3) {
//                ball++;
//                count++;
//            }
//            if (a3 == b3) {
//                strike++;
//                count++;
//            } else if (a3 == b1 || a3 == b2) {
//                ball++;
//                count++;
//            }
//
//
//            while (strike == 3) {
//
//
//                System.out.println("축하합니다. " + count + " 번만에 성공!");
//
//            }
//        }
//    }
//}
//
//
//
