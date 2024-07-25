package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        List<Integer> resultSave = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int answer; // 계산된 값이 저장될 변수
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 문자열을 읽고 charAt(0) 문자열에 몇번째것을 저장할건지 선택 (0번은 첫번째 문자를 읽어옴)
            char operator = sc.next().charAt(0);


            if (operator == '+') {
                answer = num + num2;
            } else if (operator == '-') {
                answer = num - num2;
            } else if (operator == '*') {
                answer = num * num2;
            } else if (operator == '/') {
                if (num2 != 0) {    // num2에 0값이 입력됐는지 확인
                    answer = num / num2;
                } else {
                    System.out.println("두번째 입력한 숫자는 0이 될 수 없습니다.");
                    return;
                }
            } else {
                System.out.println("사칙여산 기호를 입력 해주세요");
                return;
            }


            resultSave.add(answer); // 계산된 값을 List에 넣는다.
            System.out.println(num + "" + operator + "" + num2 + "=" + answer);
            System.out.println("resultSave 저장된 값 => " + resultSave.toString()); // List에 저장된 값 보기.

            System.out.print("첫번째 값을 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            if (sc.next().equals("remove")) { // remove 입력시 List에 첫번째 값을 삭제
                resultSave.remove(0);
                System.out.println("resultSave 저장된 값 => " + resultSave.toString());
            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
        } while (!sc.next().equals("exit"));
        System.out.println("계산이 종료되었습니다.");
    }

}
