class Rabbit1 {
    String shape;
    int xPos;
    int yPos;

    Rabbit1() {
        shape = "토끼";
    }

    void  setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}

public class Code07_10 {
    public static void main(String[] args) {
        Rabbit1 rabbit = new Rabbit1();

        System.out.printf("토끼 객체의 기본 모양은 [%s] 입니다.", rabbit.shape);
    }
}