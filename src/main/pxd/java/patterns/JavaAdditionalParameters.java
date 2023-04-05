package pxd.java.patterns;

import pxd.java.shared.ProblemPattern;

public class JavaAdditionalParameters implements ProblemPattern {

    @Override
    public void solve() {
        printName("Prodyna");
    }

    public void printName(String firstName) {
        System.out.println(String.format("The name is '%s'", firstName));
    }

}
