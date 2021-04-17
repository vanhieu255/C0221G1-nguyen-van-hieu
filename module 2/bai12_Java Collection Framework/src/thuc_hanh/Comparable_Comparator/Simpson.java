package thuc_hanh.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Simpson implements Comparable<Simpson> {
    String name;

    Simpson(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Simpson{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }
}

class SimpsonSorting {

    public static void main(String... sortingWithList) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("Homer "));
        simpsons.add(new Simpson("Marge "));
        simpsons.add(new Simpson("Bart "));
        simpsons.add(new Simpson("Lisa "));

        Collections.sort(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::print);

        Collections.reverse(simpsons);
        simpsons.stream().forEach(System.out::print);
    }

}

