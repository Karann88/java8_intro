package LambdaExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comparator {
    public static void main(String[] args) {

        // List<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(6);
        // list.add(0);
        // list.add(99);
        // list.add(6);
        // Collections.sort(list, (a, b) -> b - a);
        // System.out.println(list);

        /*
         * Set<Integer> s = new TreeSet<>();
         * s.add(22);
         * s.add(1);
         * s.add(13);
         * System.out.println("Before manual sorting : " + s);
         * 
         * Set<Integer> ss = new TreeSet<>((a, b) -> b - a);
         * ss.add(22);
         * ss.add(1);
         * ss.add(13);
         * System.out.println("After manual sorting desc : " + ss);
         */

        /*
         * Map<Integer, String> map = new TreeMap<>();
         * map.put(2, "z");
         * map.put(3, "f");
         * map.put(1, "y");
         * System.out.println("Before manual sorting : " + map);
         * 
         * Map<Integer, String> newMap = new TreeMap<>((a, b) -> b - a);
         * newMap.put(2, "z");
         * newMap.put(3, "f");
         * newMap.put(1, "y");
         * System.out.println("After manual sorting desc : " + newMap);
         */

        Student s1 = new Student(2, "Vipul");
        Student s2 = new Student(3, "Raj");
        Student s3 = new Student(33, "Karan");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, (a, b) -> b.name.length() - a.name.length());
        System.out.println(list);

        // List<Student> list = Arrays.asList(null, s1, s2, s3);
        // list.stream().sorted((a, b) -> b.id -
        // a.id).collect(Collectors.toList()).forEach(System.out::println);

        // Stream<Student> stream = Stream.of(s1, s2, s3);
        // System.out.println(stream.sorted((a, b) -> b.id -
        // a.id).collect(Collectors.toList()));
    }

    static class Student {

        public Integer id;
        public String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return this.id + " : " + this.name;
        }
    }
}
