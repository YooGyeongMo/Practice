package Homowork_2;

public class Q_10 {
    public static void main(String[] args) {

        String[] employees = new String[10];
        String name = "홍길동";

        employees[0] = name;
        name = null;

        for(int i=0; i<employees.length;i++){
            System.out.print(employees[i]);
            // 인덱스 0 은 name = "홍길동" 으로 초기화했기 때문에
            // 인덱스 0을 제외한 1~9까지는 null 값이다.
        }
    }
}
