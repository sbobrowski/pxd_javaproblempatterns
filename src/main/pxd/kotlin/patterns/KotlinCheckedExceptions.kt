package pxd.kotlin.patterns

import pxd.java.shared.ProblemPattern
import java.nio.file.Files
import java.nio.file.Path

class KotlinCheckedExceptions : ProblemPattern {


    override fun solve() {
        // adopt the paths, so they point to two text files on your local computer
        var pathList = listOf(Path.of("C:/Develop/foobar.txt"), Path.of("C:/Develop/foobar2.txt"))

        // use map operation on the list to convert the paths to the content of the text files
        // you can use Files.lines of the java.nio package for this
        // Note: use 'flatMap' instead of 'map'
        // Note: Files.lines returns a Stream, so use toList to get Iterable to make flatMap working
        

    }
}