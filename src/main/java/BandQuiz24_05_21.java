public class BandQuiz24_05_21 {                               //클래스 생성
    public static void main(String[] args) {                  //매서드 생성
        for (int i = 2, j = 1; i<= 9; j++) {                  //2단부터 9단까지를 위한 i값 2 곱할 값 j 1 지정 후 i가 9까지 반복하는 for문
            System.out.printf("%d x %d = %d%n", i, j, i * j); // i x j = i*j 출력
                    if(j == 9) {                              //j값이 9가 될 경우 j는 0으로 초기화 하고 i값을 증가 시켜 다음 단 반복
                        j = 0;                                //j로 초기화 1부터 다시 시작
                        i++;                                  //1씩 증가
                System.out.println();                         //단이 바뀔 때마다 줄바꿈
            }
        }
    }
}
