package ua.edu.ucu;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args){
        List<Integer> arr = List.of(1, 2, -1, 2, 3, -100, 2);
        System.out.println(arr.stream().map((x)->x*x).filter((x)->x<10).collect(Collectors.toList()));
        arr.stream().forEach(System.out::println);//метод-референс
        //equals to:
        arr.stream().forEach(x->System.out.println(x));

//        arr.stream().allMatch()
        Stream<Integer> stream = arr.stream();
        IntStream intStream = stream.mapToInt(x->x);
        intStream.boxed();
    }
}
