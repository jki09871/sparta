package calculator;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(new ArrayList<>(), new ArrayList<>());

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("어떤 계산을 시작할까요? 1. 사칙연산 2. 원의 넓이");
            int choice = sc.nextInt();

            if (choice == 1) {
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
                    calculator.removeResult(0);

                }

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                if (sc.next().equals("inquiry")) {
                    calculator.inquiryResults();
                }
            }else if (choice == 2) {
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();

                double area = calculator.calculateCircleArea(radius);
                System.out.println("계산된 원의 넓이 = " + area);

                System.out.print("저장된 원의 넓이를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                if (sc.next().equals("inquiry")) {
                    calculator.inquiryCircleAreas();
                }
            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
        } while (!sc.next().equals("exit"));
        System.out.println("계산이 종료되었습니다.");
    }

}
