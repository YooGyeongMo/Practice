package array;

import java.util.*;

public class bingo {
    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        Object[][] bingo = new Object[5][5];
        int[] freq = new int[26]; // 중복 방지
        //빙고판
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = rnd.nextInt(25) + 1;
                if (freq[num] == 1) {
                    j--;
                    continue;
                } else {
                    freq[num]++;
                    bingo[i][j] = num;
                }
            }
        }


        int count = 0, game; // 게임 횟수, 게임 점수
        int[] col = new int[5]; // 빙고판 가로 계산용 배열
        int[][] dae = new int[2][5]; // 빙고판 대각선 계산용 배열
        int[] row = new int[5]; // 빙고판 세로 계산용 배열
        int[] chi = new int[25]; // 선택된 수 출력용 배열
        freq = new int[26]; // 초기화
        do {
            game = 0; // 3점을 못 넘기면 초기화
            int num = rnd.nextInt(25) + 1;

            if (freq[num] == 1) { // 중복 방지
                continue;
            } else {
                freq[num]++;
                chi[count] = num;
                count++;

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (bingo[i][j].equals(num)) { // 랜덤 번호의 인덱스
                            col[i]++;
                            row[j]++;
                            bingo[i][j] = "★";

                            if (i == j) { // 왼쪽 위에서 아래쪽 아래 방향 대각선
                                dae[0][j]++;
                            } else if (j + i == 4 && j != 2 && i != 2) { // 오른쪽 위에서 왼쪽 아래로 향하는 대각선 방향과 [2][2] 중복 플러스 방지
                                dae[1][j]++;
                            }

                        }
                    }
                }

            }


            for (int data : row) {
                if (data == 5) game++;
            }
            for (int data : col) {
                if (data == 5) game++;
            }
            for (int i = 0; i < dae.length; i++) {
                int checksum = 0;
                for (int j = 0; j < dae[i].length; j++) {
                    checksum += dae[i][j];
                }
                if (checksum == 5) game++;
            }


            //출력
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%5s", bingo[i][j]);
                }
                System.out.println();
            }

            System.out.print("선택된 수 : ");
            for (int choice : chi) {
                if (choice != 0) System.out.print(choice + " ");
            }
            System.out.println("\n");
        } while (game < 3);

        System.out.println(count + "번 만에 빙고!");

    }
}