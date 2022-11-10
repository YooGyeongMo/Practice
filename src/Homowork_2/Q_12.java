package Homowork_2;

public class Q_12 {
    public static void main(String[] args) {
        double [] arr = {1.0, 2.0, 3.0, 4.0};

        double sum =0;
        double max =0;

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
            sum += arr[i];
            max = Math.max(arr[i], max);
        }
        System.out.println();


        System.out.println("합은 :" + sum);
        System.out.println("최대값은 :" + max);

    }
}
