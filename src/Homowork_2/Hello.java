package Homowork_2;

import java.util.Scanner;

public class Hello {

        public static void main(String[] args) {
            System.out.print("학생 수를 입력하세요 : ");
            Scanner input = new Scanner(System.in);
            int num =input.nextInt();

            Student stu = new Student();
            stu.setGrade(num);
            stu.getAvg(num);
        }

    }


