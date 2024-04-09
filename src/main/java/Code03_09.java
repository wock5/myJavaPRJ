public class Code03_09 {
    public static void main(String[] args) {
        int num=20;

        System.out.println(++num + " "); //num 변수 출력전에 +1 되어서 21출력 기존의 있는 값에 +1을 한다 앞++

        System.out.println(num++ + " ");//num 변수가 먼저 실행(출력) 된 후 연산 21이 실행된후 +1이 처리된다 뒷++
        System.out.println(num + " ");// 뒷++로 인해 출력만해도 +1 이 된 22가 출력

        System.out.println(--num + " "); // -1 이 실행된후 출력 21출력

        System.out.println(num-- + " "); // 실행(출력) 된후 출력 21출력
        System.out.println(num + " "); // 20 출력

        num++ ;
        System.out.print(num+" ");
        num-- ;
        System.out.print(num+" ");
        num += 3 ;
        System.out.print(num+" ");
        num -= 3 ;
        System.out.print(num+" ");
        num *= 3;
        System.out.print(num+" ");
        num /= 3;
        System.out.print(num+" ");
        num %= 3;
        System.out.print(num+" ");
    }
}
