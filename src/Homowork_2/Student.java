package Homowork_2;

import java.util.*;

class Student {
    int grade, total;
    double avg;

    public Student() {
        this.grade = 0;
        this.total = 0;
        this.avg = 0;
    }

    public int setGrade(int num) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("학생의 %d의 성적을 입력하세요 : ", i + 1);
            this.grade = input.nextInt();
            arr[i] = this.grade;
            if (this.grade > 100) {
                System.out.println("잘못된 성적입니다. 다시 입력하세요. ");
                this.grade = input.nextInt();
                arr[i] = this.grade;
            }
            this.total += arr[i];
        }
        return this.total;
    }

    public void getAvg(int num) {
        this.avg = this.total / num;
        System.out.println("성적의 평균은 " + this.avg + "입니다. ");
    }
    }


