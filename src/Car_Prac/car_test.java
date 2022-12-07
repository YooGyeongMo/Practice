package Car_Prac;

public class car_test {
    public static void main(String[] args) {
        car my_car = new car("빨강", 50 ,5);
            System.out.println(my_car.gear);

            my_car.speedUp();
            System.out.println(my_car.speed);
            my_car.speedDown();

            //my_car = 객체 주소값 나옴.
            my_car.setColor("Red");

        my_car.print();
    }

}
