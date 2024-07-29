package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator {

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator(List<Double> results, AddOperator addOperator, SubtractOperator subtractOperator,
                                MultiplyOperator multiplyOperator, DivideOperator divideOperator) {
        super(results);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }


    public double calculate(double firstValue, double secondValue, char operator) {
        double answer = 0;

        switch (operator) {
            case '+':
                answer = addOperator.addition(firstValue, secondValue);
                break;
            case '-':
                answer = subtractOperator.subtraction(firstValue, secondValue);
                break;
            case '*':
                answer = multiplyOperator.multiply(firstValue, secondValue);
                break;
            case '/':
                if (secondValue != 0) {
                    answer =  divideOperator.divide(firstValue, secondValue);
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
