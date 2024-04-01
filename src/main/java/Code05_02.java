import java.util.Scanner;

public class Code05_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num < 100) {
            System.out.println("100보다");
            System.out.println("작습니다");
            System.out.println(".");
        }
        System.out.println("난 무조건 실행 된다.");
    }
}
