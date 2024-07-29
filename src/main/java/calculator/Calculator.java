package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Integer> resultSave = new ArrayList<>();


    public int calculate(int firstValue, int secondValue, char operator) {
        int answer = 0; // 계산된 값이 저장될 변수


        if (operator == '+') {
            answer = firstValue + secondValue;
        } else if (operator == '-') {
            answer = firstValue - secondValue;
        } else if (operator == '*') {
            answer = firstValue * secondValue;
        } else if (operator == '/') {
            if (secondValue != 0) {    // firstValue2에 0값이 입력됐는지 확인
                answer = firstValue / secondValue;
            } else {
                throw new ArithmeticException("두번째 입력한 숫자는 0이 될 수 없습니다.");
            }
        } else {
            throw new UnsupportedOperationException("사칙여산 기호를 입력 해주세요");
        }
        return answer;
    }

    public List<Integer> getResultSave(){
        return resultSave;
    }

    public void setResultSave(List<Integer> resultSave){
        this.resultSave = resultSave;
    }

    public void removeResult(int intdex) {
       resultSave.remove(intdex);
    }
}
