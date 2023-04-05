package pxd;

import pxd.java.patterns.JavaUtilClass;
import pxd.kotlin.patterns.KotlinUtilClass;

public class PXDDemoApplication {

    public static void main(String[] args) {
        javaSolution();
        kotlinSolution();
    }

    public static void javaSolution() {
        var pattern = new JavaUtilClass();

        pattern.solve();
    }

    public static void kotlinSolution() {
        var pattern = new KotlinUtilClass();

        pattern.solve();
    }
}
