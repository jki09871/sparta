package calculator;

public class CircleCalculator extends Calculator {
    private static final double PI = 3.141592;

    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        addResult(area);
        return area;
    }
}
