class Rabbit1 {
    String shape;
    int xPos;
    int yPos;

    Rabbit1(String rabbitcolor){
        shape = rabbitcolor;
    }


    void  setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}

public class Code07_10 {
    public static void main(String[] args) {
        Rabbit1 rabbit1 = new Rabbit1("파란색");
        System.out.println(rabbit1.shape);

        Rabbit1 rabbit2 = new Rabbit1("rabbitcolor");
        System.out.println("rabit : " + rabbit2.shape);

        Rabbit1 rabbit3 = new Rabbit1("2");
        System.out.println("rabit : "+ rabbit3.shape);
    }
}