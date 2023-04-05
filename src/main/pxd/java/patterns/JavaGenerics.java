package pxd.java.patterns;

import pxd.java.shared.ProblemPattern;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics implements ProblemPattern {

    @Override
    public void solve() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(3L);

        List<Double> doubleList = (List) numbers;
        var myDouble = doubleList.get(0);

        System.out.println("myDouble = " + myDouble);
    }
}
