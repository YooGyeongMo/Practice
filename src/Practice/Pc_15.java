package Practice;

import java.util.*;

public class Pc_15 {
    public static void main(String[] args){


       int i = 1;
       int j ;
        {
       while (i < 10 ) {
            j = 1;
           while (j < 10) {
               System.out.printf("%d * %d = %2d\t" , j , i ,j*i);
               j++;

           }
           System.out.println();
           i++;
         }
        }

    }
}
