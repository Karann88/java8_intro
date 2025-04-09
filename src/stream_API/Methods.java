package stream_API;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        // Filter(predicate)
        // predicate is interface which means a boolean valued function
        // e -> e > 10 for a single line
        // e -> { return true } for multiple line

        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Karan");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        // map (Function)
        /*
         * each element operation
         */

        List<Integer> numbers = List.of(23,4,2,5,7,4);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers); 

        // It'll give the same output as above but not in the form of List.
        /*
         * names.stream().forEach(e -> {
         *   System.out.println(e);
         * }); 
        */

        // Shortcut
        /*
        * newNames.stream().forEach(System.out::println);
        */

        // Sorted 
        numbers.stream().sorted().forEach(System.out::println);

        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min : " + integer);

        Integer integer1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max : " + integer1);
    }
}
