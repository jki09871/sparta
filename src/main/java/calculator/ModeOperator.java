package calculator;

public class ModeOperator implements ModOperate{
    @Override
    public int percent(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }

    @Override
    public int divide(int firstNum, int secondNum) {
        int result = 0;
        if (secondNum != 0) {
            result = firstNum / secondNum;
        } else {
            throw new ArithmeticException("두번째 입력한 숫자는 0이 될 수 없습니다.");
        }
        return result;
    }

    @Override
    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    @Override
    public int addition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    @Override
    public int subtraction(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
