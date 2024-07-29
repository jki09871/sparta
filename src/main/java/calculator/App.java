package calculator;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(
                new ArrayList<>(),
                new AddOperator(),
                new SubtractOperator(),
                new MultiplyOperator(),
                new DivideOperator()
                );
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        do {
            System.out.println("어떤 계산을 시작할까요? 1. 사칙연산 2. 원의 넓이");
            double choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("첫 번째 값을 입력하세요: ");
                double firstValue = sc.nextInt();

                System.out.print("두 번째 값을 입력하세요: ");
                double secondValue = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                double result = arithmeticCalculator.calculate(firstValue, secondValue, operator);
                System.out.println("계산 결과 = " + result); // 123

                System.out.print("첫번째 값을 삭제하시겠습니까? (remove 입력 시 삭제) : ");
                if (sc.next().equals("remove")) { // remove 입력시 List에 첫번째 값을 삭제
                    arithmeticCalculator.removeResult(0);

                }

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                if (sc.next().equals("inquiry")) {
                   arithmeticCalculator.inquiryResults();
                }

            } else if (choice == 2) {
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();

                double area = circleCalculator.calculateCircleArea(radius);

                System.out.println("계산된 원의 넓이 = " + area);

                System.out.print("저장된 원의 넓이를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                if (sc.next().equals("inquiry")) {
                    arithmeticCalculator.inquiryResults();
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
        } while (!sc.next().equals("exit"));

        System.out.println("계산이 종료되었습니다.");
    }
}
