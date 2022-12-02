package 생성자;

public class TV {
    String model;
    int year;
    int inch;

    TV(String c , int i , int j){
        model = c;
        year = i;
        inch = j;
    }
    void show(){
        System.out.print(model + "에서 만든 " + year + "년 형 " + inch + " 인치 TV");
    }
}
