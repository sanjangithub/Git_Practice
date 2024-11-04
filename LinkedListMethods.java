import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LinkedListMethods {
    public static void main(String[] args) {
    //     LinkedList<String> cars = new LinkedList<String>();
    // cars.add("Volvo");
    // cars.add("BMW");
    // cars.add("Ford");
    // cars.add("Mazda");

    // List<String> updatedCars = cars.stream().map(String::toUpperCase).collect(Collectors.toList());

    // Collections.reverse(updatedCars);
    // updatedCars.forEach(System.out::println);
    // System.out.println("Now this list is converted to array");

    // Object[] updatedCarsArr = updatedCars.toArray();

    // Method 2: Specifying type (String Array)
    //String[] namesArray2 = namesList.toArray(new String[0]);
    
    // System.out.println(Arrays.binarySearch(updatedCarsArr, "volvo"));

    String[] nms = {"salmaan","shah rukh","Aamir","Sohail","Vicky Kaushal"};
    // List<String> nmsList = new ArrayList<>(Arrays.asList(nms));
    // System.out.println(nmsList);
    // System.out.println("------------");
    // ListIterator<String> li = nmsList.listIterator();
    // while (li.hasNext()) {
    //     String nameEquals = "aamir";
    //     if(li.next().equalsIgnoreCase(nameEquals))
    //     {
    //         li.set("Aamir Khan");
    //     }
    // }
    // nmsList.forEach(System.out::println);
    
    String[] jkl = Arrays.stream(nms).map(String::toLowerCase).filter(i-> i.startsWith("s")).toArray(String[]::new);
    String newJkl[] = Arrays.copyOf(jkl, 2);
    System.out.println(Arrays.toString(newJkl));
        // String[] nms = {"salmaan", "shah rukh", "Aamir", "Sohail", "Vicky Kaushal"};

        // // Collect the filtered elements into a new array dynamically
        // String[] jkl = Arrays.stream(nms)
        //         .map(String::toLowerCase)
        //         .filter(i -> i.startsWith("s"))
        //         .toArray(String[]::new);

        // // Copy the filtered array into a new array of size 2
        // String[] newJkl = Arrays.copyOf(jkl, 2);

        // // Print the new array
        // System.out.println(Arrays.toString(newJkl));
    }
}
