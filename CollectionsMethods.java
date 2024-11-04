import java.util.*;
import java.util.stream.Collectors;

public class CollectionsMethods {
    public static void main(String[] args) {

        try {
            ArrayList<String> koreanBrands = new ArrayList<>();
            ArrayList<String> koreanBrands2 = new ArrayList<>();
            try (Scanner sc = new Scanner(System.in)) {
                koreanBrands.ensureCapacity(3);
                koreanBrands.add("samsung");
                koreanBrands.add("missha");
                koreanBrands.add("bts");
                koreanBrands.add("samsung");
                koreanBrands.add("samsung");
                koreanBrands.add("samsung");
                koreanBrands.add("samsung");
   
                System.out.println("enter the name you want to search in the list - ");
                String input = sc.nextLine();
                boolean yorn = koreanBrands.contains(input);
                System.out.println("---------");

                if(yorn==true)
                {
                    System.out.println("This is the final list - ");
                    koreanBrands.stream().filter(i -> !i.equalsIgnoreCase(input)).collect(Collectors.toList()).forEach(System.out::println);
                }
                else
                {
                    throw new Exception("This is not present in the list");
                }
            }
        } catch (Exception e) {
            System.out.println("This is the exception - "+e);
        }

        // boolean isItemPresent = koreanBrands.contains("samsung");

        // Iterator<String> m = koreanBrands.iterator();
        // while (m.hasNext())
        // {
        //     if(isItemPresent==true && m.next().equals(input))
        //     {
        //         m.remove();
        //     }
        // }
        // koreanBrands2 = (ArrayList)koreanBrands.clone();
        // koreanBrands2.forEach(System.out::println);

        // koreanBrands2.addAll(koreanBrands);
        // System.out.println(koreanBrands2);
    }
}


// import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Collectors;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> koreanBrands = new ArrayList<>();
//         koreanBrands.add("samsung");
//         koreanBrands.add("missha");
//         koreanBrands.add("bts");
//         koreanBrands.add("samsung");
//         koreanBrands.add("samsung");
//         koreanBrands.add("samsung");
//         koreanBrands.add("samsung");

//         if (koreanBrands.contains("sanjan")) {
//             // Remove "sanjan" from the list
//             koreanBrands = koreanBrands.stream()
//                                        .filter(brand -> !brand.equals("sanjan"))
//                                        .collect(Collectors.toCollection(ArrayList::new));
//         } else {
//             // Remove all items from the list
//             koreanBrands.clear();
//         }

//         koreanBrands.forEach(System.out::println);
//     }
// }

