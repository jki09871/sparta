package calculator;

import java.util.List;

public class CircleCalculator extends Calculator {
    private static final double PI = 3.141592;

    public CircleCalculator(List<Double> results) {
        super(results);
    }

    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        return area;
    }
}
