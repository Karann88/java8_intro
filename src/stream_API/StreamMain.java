package stream_API;

// Stream API are related to collection frameWork/(Group of objects). These streams are very different from io stream, io streams are the sequence of data.
// of bytes, while stream API are the sequence of objects.
// Stream API are used to process data in a pipeline fashion, i.e., one operation after another
// Perform bulk operations and process the objects of collection.
// Reduced the code length.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        // Create a list and filter all even numbers from the list
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);

        // List<Integer> list2 = new ArrayList<>();
        // list2.add(12);
        // list2.add(34);
        // list2.add(23);
        // list2.add(78);

        // List<Integer> list3 = Arrays.asList(23,567, 53, 90, 12);

        // list1
        // without stream API

        // List<Integer> listEven = new ArrayList<>();
        // for (int i : list1) {
        //     if (i % 2 == 0) {
        //         listEven.add(i);
        //     }
        // }
        // System.out.println(list1);
        // System.out.println("Even numbers from list1: " + listEven);

        // Using stream API

        // Stream<Integer> stream = list1.stream();
        // List<Integer> newList = stream.filter(i -> i % 2 ==
        // 0).collect(Collectors.toList()); // returns a new list with even numbers
        // System.out.println(newList);

        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i > 50).collect(Collectors.toList());
        System.out.println(newList1);

        // List<String> list = Arrays.asList("Apple", "Banana", "Mango");
        // Stream<String> myStream = list.stream();

        // String[] array = {"Apple", "Banana", "Mango"};
        // Stream<String> stream = Arrays.stream(array);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4322, 9, 0, 5, 44, 23, 433, 0, 1, 2);
        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct()
                .sorted((x, y) -> (y - x)).limit(4).skip(1).collect(Collectors.toList());
        System.out.println(filteredList);
        // List<Integer> mappedList = filteredList.stream().map(x -> x /
        // 2).collect(Collectors.toList());
        // System.out.println(mappedList);

        List<Integer> collect = Stream.iterate(0, x -> x + 1).limit(101).skip(1).filter(x -> x % 2 == 0)
                .map(x -> x / 10).distinct().sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
