package Practice;

import java.util.*;;

public class LoTTo {
    public static void main(String[] args) {

        int [ ] Lotto = new int[6];
        int [ ] freq = new int[46];

        System.out.println("====== 로또 복권번호 생성 ======");


        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        for(int i=0;i<6;i++){
            Lotto[i] = rnd.nextInt(45)+1;
            if(freq[Lotto[i]] == 1)
                i--;
            else
                freq[Lotto[i]] = 1;

        }
        for(int i=0; i < Lotto.length; i++ ){
            System.out.print(Lotto[i] + "  ");
        }
    }

}
