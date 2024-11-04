import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HashmapMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> personsAndAges = new HashMap<>();
        List<Integer> blah = new ArrayList<>();
        blah.add(1); blah.add(2); blah.add(3); blah.add(4); blah.add(5);

        List<String> names = new ArrayList<>();
        names.add("Sanjan"); names.add("Jesus");

        personsAndAges.put("Jaikar", 54);
        personsAndAges.put("Bharathi", 54);
        personsAndAges.put("Harshini", 18);
        personsAndAges.put("Sanjan", 24);
        personsAndAges.put("Ruby", 24);

        // System.out.println("Enter the age you want to search - ");

        // int personage = sc.nextInt();

        // System.out.println("Enter name - ");
        // String input = sc.nextLine().toLowerCase();

        // Integer age = null;
        // for (String key : personsAndAges.keySet()) {
        //     if (key.toLowerCase().equals(input)) {
        //         age = personsAndAges.get(key);
        //         break;
        //     }
        // }

        // if (age != null) {
        //     System.out.println("Age of " + input + " is: " + age);
        // } else {
        //     System.out.println("Name not found.");
        // }

        // Integer age = personsAndAges.entrySet().stream().filter(i-> input.equalsIgnoreCase(i.getKey())).map(i -> i.getValue()).findFirst().orElse(null);
        // if(age!= null)
        // {
        //     System.out.println("Name - "+input+", age "+age);
        // }
        // else{
        //     System.out.println("No name found");
        // }
        // personsAndAges.remove("Jaikar");
        // System.out.println(personsAndAges.size());

        // Collection<Integer> personAndAgesSet = personsAndAges.values();
        // Integer[] personAgeArr = personAndAgesSet.toArray(Integer[]::new);
        // System.out.println(personsAndAges.entrySet().stream().filter(i -> i.getValue()==54).map(Map.Entry::getKey).findFirst());
        // personsAndAges.entrySet().stream().filter(i -> i.getValue()==personage).map(i -> i.getKey()).forEach(System.out::println);

        // System.out.println(personsAndAges.containsKey("Jaikar"));
        // Set<String> personAndAgesSetCollection = personsAndAges.keySet();
        // Collection<Integer> agesSet = personsAndAges.values();
        // String[] personAndAgesArray = personAndAgesSetCollection.toArray(String[]::new);
        // Integer[] agesArr = agesSet.toArray(Integer[]::new);
        // System.out.println(Arrays.stream(personAndAgesArray).filter(i -> i.contains("Jaikar")).map(String::toUpperCase).findAny());
        // List<Integer> intFilteredList = Arrays.stream(agesArr).filter(i->i==24).collect(Collectors.toList());
        // System.out.println(intFilteredList);

        // Integer[] blahNumsArr = blah.toArray(Integer[]::new);
        // System.out.println(Arrays.stream(blahNumsArr).filter(i -> i>100).map(i -> i*2).reduce((n,m) -> n+m).orElseThrow(NotInTheCollectionException::new));

        // System.out.println(names.stream().filter(i -> !i.equals("Sanjan") && !i.equals("Satan")).map(String::toUpperCase).findFirst().orElseThrow(ThisIsNotAllowedException::new));

        // personsAndAges.replace("Jaikar", 54, 45);
        // // System.out.println(personsAndAges);

        // Map<String, Integer> newUpdatedList = new HashMap<>();
        // newUpdatedList = (HashMap)personsAndAges.clone();
        // System.out.println(newUpdatedList);
        // boolean torf = newUpdatedList.isEmpty();
        // Optional.of(newUpdatedList).stream().filter(i -> !i.isEmpty()).ifPresentOrElse(i -> i.entrySet().stream().forEach(System.out)::println);
        // int n=1;
        // for(int i=5; i>=n; i--)
        // {
        //     for(int j=i; j<=n; j++)
        //     {
        //         System.out.print("Jesus| ");
        //     }
        //     System.out.println("");
        //     System.out.println("-----------------------------------");
        // }

        // String str = "Sanjan is in ost";
        // char[] strArr = str.toCharArray();
        // System.out.println("Enter the letter you want to search - ");
        // char input = sc.nextLine().charAt(0);

        // int count = 0;

        // Method - 1
        // long count = IntStream.range(0, strArr.length).map(i -> strArr[i]).filter(i->i==input).count();
        // System.out.println(String.valueOf("The count for input - "+input+" is - "+count));

        // for(char i : strArr)
        // {
        //     if(i==input)
        //     {
        //         count++;
        //     }
        // }

        // System.out.println(input+" is present "+count+" times.");

        String str = "SANJan is the worst fellow in this universe. Ofcourse not. sanjan is sometimes smarter & sometimes sanjan is dumb";

        String input="sanjan";

        int count = 0;

        String[] strWordsArr = str.split("\\s");

        for(String i : strWordsArr)
        {
            if(i.equalsIgnoreCase(input))
            {
                count++;
            }
        }
        System.out.println(input+" is there for "+count+" times in this file");
    }
}
