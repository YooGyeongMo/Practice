package Homework;

public class Q_17 {
    public static void main(String[] args) {


        int x, y, z;

        for (x = 0; x <= 10; x++) {
            for (y = 0; y <= 10; y++){
                for(z=0; z<= 10; z++){
                    if(x+y+z== 10){
                        System.out.println("(" + x +","+ y +","+ z + ")");
                    }
                }
            }
        }
    }
}