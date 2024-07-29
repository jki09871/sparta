package calculator;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        int answer; // 계산된 값이 저장될 변수
        do {
            System.out.print("첫 번째 값을 입력하세요: ");
            int firstValue = sc.nextInt();

            System.out.print("두 번째 값을 입력하세요: ");
            int secondValue = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 문자열을 읽고 charAt(0) 문자열에 몇번째것을 저장할건지 선택 (0번은 첫번째 문자를 읽어옴)
            char operator = sc.next().charAt(0);

            int calculate = calculator.calculate(firstValue, secondValue, operator);
            calculator.getResultSave().add(calculate);



            System.out.print("첫번째 값을 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            if (sc.next().equals("remove")) { // remove 입력시 List에 첫번째 값을 삭제
                calculator.getResultSave().remove(0);

            }

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
            if (sc.next().equals("inquiry")) {

                // 향상된 for문 resultSave에 저장된 값을 하나씩 calculatedValue 변수에 담는다.
                for (Integer calculatedValue : calculator.getResultSave()) {
                    System.out.println("저장된 값 = " + calculatedValue.toString());
                }
            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
        } while (!sc.next().equals("exit"));
        System.out.println("계산이 종료되었습니다.");
    }

}
