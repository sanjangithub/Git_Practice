import java.util.ArrayList;

public class SomeStuff {
    public static void main(String[] args) {
        ArrayList name = new ArrayList<>();

        name.add("Sanjan");
        name.add("Kiran");
        name.add("Rajesh");

        name.stream().forEach(System.out::println);
    }
}