import java.util.ArrayList;

public class SomeStuff {
    public static void main(String[] args) {
      
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3); numbers.add(5); numbers.add(710);

        numbers.stream().map(i -> i*8).map(i -> i/3).forEach(System.out::println);
    }
}
