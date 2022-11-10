package Homowork_2;

public class Q_06 {
    public static void main(String[] args) {
        //6. int[] employees = new int[5];와 같은 배열 선언이 있다고 하자.
        //(1) 유효한 인덱스의 범위는?
        // 0 ~ 4
        //(2) 만약 employees[5]와 같이 원소를 접근하였다면 어떤 일이 발생하는가?
        // Out of bound error

        int[] employees = new int[5];

        System.out.print(employees[5]);

    }
}
