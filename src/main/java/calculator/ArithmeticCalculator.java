package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    private final ModOperate modOperate;

    public ArithmeticCalculator(List<Double> results,ModOperate modOperate) {
        super(results);
        this.modOperate = modOperate;
    }


    public int calculate(int firstValue, int secondValue, char operator) {
        int answer = 0;

        switch (operator) {
            case '+':
                answer = modOperate.addition(firstValue, secondValue);
                break;
            case '-':
                answer = modOperate.subtraction(firstValue, secondValue);
                break;
            case '*':
                answer = modOperate.multiply(firstValue, secondValue);
                break;
            case '%':
                answer = modOperate.percent(firstValue, secondValue);
                break;
            case '/':
                answer = modOperate.divide(firstValue, secondValue);
                break;
            default:
                throw new UnsupportedOperationException("사칙연산 기호를 입력 해주세요");
        }
        return answer;
    }
}
