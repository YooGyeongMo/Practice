package Homework;


public class Q_16 {
    public static void main(String[] args) {
        int x, y;

        for( x = 0; x<=10; x++){
            for(y = 0; y<=10; y++){
                if(3*x+10*y == 100){
                    System.out.print("(" +x + ","+y+")");

                }
            }
        }

    }
}
