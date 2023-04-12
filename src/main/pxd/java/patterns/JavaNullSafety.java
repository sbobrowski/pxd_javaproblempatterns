package pxd.java.patterns;

import pxd.java.shared.ProblemPattern;

public class JavaNullSafety implements ProblemPattern {

    @Override
    public void solve() {
        Person person = null;

    }

    public record Person(String name, Address address) {
    }

    public record Address(String street) {
    }
}
