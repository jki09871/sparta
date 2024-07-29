package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static final double PI = 3.141592;
    private List<Integer> resultSave;
    private List<Double> circleAreas;

    public Calculator(List<Integer> resultSave, List<Double> circleAreas){
        this.resultSave = resultSave;
        this.circleAreas = circleAreas;
    }


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

    // 사칙연산 결과 리스트에서 특정 인덱스의 결과를 삭제하는 메서드입니다.
    public void removeResult(int intdex) {
       resultSave.remove(intdex);
    }

    // 사칙연산 결과 리스트를 조회하는 메서드입니다.
    public void inquiryResults() {
        for (Integer calculatedValue : resultSave) {
            System.out.println("저장된 값 = " + calculatedValue.toString());
        }
    }

    // 원의 넓이를 계산하는 메서드입니다.
    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        circleAreas.add(area);
        return area;
    }

    // 원의 넓이 결과를 저장하는 리스트의 Getter와 Setter입니다.
    public List<Double> getCircleAreas() {
        return circleAreas;
    }

    // 원의 넓이 결과 리스트를 조회하는 메서드입니다.
    public void inquiryCircleAreas() {
        for (Double area : circleAreas) {
            System.out.println("저장된 원의 넓이 = " + area);
        }
    }

}
