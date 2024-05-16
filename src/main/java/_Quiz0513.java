class Car1{
    private int speed;
    private  String color;

    void setCar(int speed, String color){
        this.speed = speed;
        this.color = color;
    }

    Car1(int speed){
        this.speed = speed;
    }
}

public class _Quiz0513{
    public static void main(String[] args) {
        Car1 car1 = new Car1(100);
    }
}