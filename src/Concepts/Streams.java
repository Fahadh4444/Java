package Concepts;

import java.util.*;
import java.util.stream.Stream;

public class Streams {
    List<Integer> nums = Arrays.asList(6, 5, 2, 3, 9, 1);
    Stream<Integer> d = nums.stream();

    void studyStream(){
        d.filter(n -> n%2==1)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

        System.out.println("---------");

        int result = nums.stream()
                .filter(n -> n%2 == 1)
                .sorted()
                .map(n -> n*2)
                .reduce(0, (c,d) -> c+d);
        System.out.println(result);
    }


}
