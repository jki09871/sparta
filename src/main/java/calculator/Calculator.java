package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    protected List<Double> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

//    public List<Double> getResults() {
//        return results;
//    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public void addResult(Double result) {
        results.add(result);
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
