package Lecture;

public class Lec_19 {
    public static void main(String[] args){

        int[] s = new int[10];

        for(int i = 0; i<s.length;i++){ //9번
            s[i] = i;
        }

        for(int i = 0; i < s.length;i++){
            System.out.print(s[i] +" ");
        }
    }
}
