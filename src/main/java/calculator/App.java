package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[] resultSave = new int[10];
        int index = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("num =" + num);
            System.out.println("num2 =" + num2);

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 문자열을 읽고 charAt(0) 문자열에 몇번째것을 저장할건지 선택 (0번은 첫번째 문자열을 읽어옴)
            char operator = sc.next().charAt(0);

            System.out.println("operator = " + operator);

            int answer = 0;

            if (operator == '+') {
                answer = num + num2;
            } else if (operator == '-') {
                answer = num - num2;
            } else if (operator == '*') {
                answer = num * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    answer = num / num2;
                } else {
                    System.out.println("두번째 입력한 숫자는 0이 될 수 없습니다.");
                    return;
                }
            } else {
                System.out.println("사칙여산 기호를 입력 해주세요");
                return;
            }

            System.out.println("결과: " + answer);
            resultSave[index] = answer;
            index++;
//            가장 기본적이게 보는 방법 1첫째 방법
//            for (int i = 0; i < resultSave.length; i++){
//                System.out.println(i +"번째 결과 = " + resultSave[i]);
//            }
//            배열의 값을 더 편하게 볼 수있는 방법
            System.out.println("Arrays.toString(resultSave) = "+Arrays.toString(resultSave));

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        }while (!sc.next().equals("exit"));
        System.out.println("계산이 종료되었습니다.");
    }
}
