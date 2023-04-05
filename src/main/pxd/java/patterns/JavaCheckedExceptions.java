package pxd.java.patterns;

import pxd.java.shared.ProblemPattern;

import java.nio.file.Path;
import java.util.List;

public class JavaCheckedExceptions implements ProblemPattern {

    @Override
    public void solve() {
        Path path1 = Path.of("C:/Develop/foobar.txt");
        Path path2 = Path.of("C:/Develop/foobar2.txt");

        List.of(path1, path2)
                .stream();


    }

}
