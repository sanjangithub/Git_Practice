import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysMethodsPractice {
    public static void main(String[] args) {
        String[] famTree = {"jaikar","daiva","visvasi","grace"};
        Arrays.parallelPrefix(famTree, (a,b) -> a+ " chikkala"+b+" chikkala");
        System.out.println(Arrays.toString(famTree));
    }
}
