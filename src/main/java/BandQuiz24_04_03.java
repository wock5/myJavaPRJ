import java.util.Scanner; //스캐너 호출

public class BandQuiz24_04_03 { //클래스 명
    public static void main(String[] args) { //메인생성
        Scanner s = new Scanner(System.in); //값 입력하는 스캐너 선언
        System.out.print("값입력:"); //입력창
        int a=s.nextInt(); //입력하는 정수값 a대입

        if (a%21==0) { //3과 7의 배수를 만족하는 조건1: 최소 조건 만족 숫자:21
            System.out.println("3과 7의 배수 모두 만족합니다."); //조건1 충족시 출력되는 문장

        } else if (a%3==0) { //3의 배수를 만족하는 조건2
            System.out.println("3의 배수입니다."); //조건2 충족시 출력되는 문장
        } else if (a%7==0) { //7의 배수를 만족하는 조건3
            System.out.println("7의 배수입니다."); //조건3 만족시 출력되는 문장
        }
        else { //조건 1,2,3 모두 해당 되지 않는 경우 출력되는 문장
            System.out.println("3과 7의 배수 모두 만족하지 않습니다.");
        }
    }
}


