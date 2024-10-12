package ua.edu.ucu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlattingTask {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            data.add(sc.next());
        }
        System.out.println(flattingStrings(data));
    }

    public static List<String> flattingStrings(List<String> data) {
        return data.stream().flatMap(s->s.chars().boxed()).map(i ->(char) i.intValue()).map(Object::toString).toList();

    }
}