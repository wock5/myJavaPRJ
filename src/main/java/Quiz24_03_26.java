public class Quiz24_03_26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i = i + 2) {
            for (int j = 1; j <= 7; j++) {
                if (j <= (7 - i) / 2) {
                    System.out.print(' ');
                } else if (j > 7 - (7 - i) / 2) {
                    System.out.print(' ');
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}