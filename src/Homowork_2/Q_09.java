package Homowork_2;

public class Q_09 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = new int[5];
        b = a; // 배열 a를 배열 b로 복사
        System.out.print(a);
        System.out.print(b);
        //수정
        for(int i =0; i<a.length;i++){
            b[i]=a[i];
            System.out.print(a);
        }

    }
}
