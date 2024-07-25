package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("num =" + num);
        System.out.println("num2 =" + num2);

        System.out.print("사칙연산 기호를 입력하세요: ");
        // 문자열을 읽고 charAt(0) 문자열에 몇번째것을 저장할건지 선택 (0번은 첫번째 문자열을 읽어옴)
        char operator= sc.next().charAt(0);

        System.out.println("operator = " + operator);
    }
}
