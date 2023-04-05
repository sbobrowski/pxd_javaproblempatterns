package pxd.java.patterns;

import pxd.java.shared.ProblemPattern;

import java.nio.file.Path;
import java.util.stream.Stream;

public class JavaTryMonad implements ProblemPattern {

    @Override
    public void solve() {
        Path path1 = Path.of("C:/Develop/foobar.txt");
        Path path2 = Path.of("C:/Develop/foobar2.txt");
        Path path3 = Path.of("C:/Develop/foobar3.txt");

        Stream.of(path1, path2, path3);


    }
}
