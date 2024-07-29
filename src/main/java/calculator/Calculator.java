package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    protected List<Double> results;

    public Calculator(List<Double> results) {
        this.results = results;
    }


    public void setResults(List<Double> results) {
        this.results = results;
    }

    public List<Double> addResult() {
        return results;
    }

    public void removeResult(int index) {
        results.remove(index);
    }

    public void inquiryResults() {
        for (Double result : results) {
            System.out.println("저장된 값 = " + result);
        }
    }
}
