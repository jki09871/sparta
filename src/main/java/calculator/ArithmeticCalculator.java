package calculator;

public class ArithmeticCalculator extends Calculator {

    public double calculate(double firstValue, double secondValue, char operator) {
        double answer = 0;

        switch (operator) {
            case '+':
                answer = firstValue + secondValue;
                break;
            case '-':
                answer = firstValue - secondValue;
                break;
            case '*':
                answer = firstValue * secondValue;
                break;
            case '/':
                if (secondValue != 0) {
                    answer = firstValue / secondValue;
                } else {
                    throw new ArithmeticException("두번째 입력한 숫자는 0이 될 수 없습니다.");
                }
                break;
            default:
                throw new UnsupportedOperationException("사칙연산 기호를 입력 해주세요");
        }
        addResult(answer);
        return answer;
    }
}
