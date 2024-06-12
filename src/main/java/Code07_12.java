class Rabbit2 {
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Rabbit2 r = new Rabbit2();

        //   r.xPos = 100; //에러

        rabbit.setPosition(100, 200);
    }
}