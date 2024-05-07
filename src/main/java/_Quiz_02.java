import java.util.Scanner; //스캐너 클래스 호출
public class _Quiz_02 {
    public static void main(String[] args) { //메인함수생성
        Scanner s = new Scanner(System.in); //값을 입력받는 스캐너 클래스
        int hap = 0; // hap의 값을 0으로 정한다.

        System.out.print("첫번째 숫자를 입력하세요==>"); //화면에 괄호안의 문구 출력. 
        int a = s.nextInt(); //사용자한테 a의 값을 입력받는다. a는 정수형태.
        System.out.print("두번째 숫자를 입력하세요==>"); //화면에 괄호안의 문구 출력. 
        int b = s.nextInt(); //사용자한테 b의 값을 입력받는다. b는 정수형태.

        for (int i = a; i <= b; i ++) { // a부터 시작해서 i값이 b가s 될때까지 1씩 증가하는반복문.
            if (i % 2 != 0){ // i가 홀수인 경우에만 실행
                hap = hap + i; // hap에 현재의 홀수 i를 더함
            }
        }
        System.out.println(a + "부터 " + b + "까지의 홀수의 합 : " + hap);  // 결과 출력

        s.close(); //스캐너를 닫음.
    }
}