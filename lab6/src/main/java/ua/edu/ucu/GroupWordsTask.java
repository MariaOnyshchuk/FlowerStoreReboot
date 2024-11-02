package ua.edu.ucu;
import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            data.add(sc.next());
        }
        System.out.println(groupIt(data));
    }

    public static Map<String, Integer> groupIt(List<String> data) {

        Map<Character, List<String>> res = data.stream().sorted().collect(Collectors.groupingBy(x->x.charAt(0)));
        Map<String, Integer> countedChars = res.entrySet().stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toString(), // Convert the key to a String
                        entry -> countChar(entry.getValue()) // Apply the countChar method to each group
                ));

        return countedChars;
    }
    public static int countChar(List<String> words){
        int sum = 0;
        for (String word: words){
            sum+=word.chars().filter(ch -> ch == word.charAt(0)).count();
        }
        return sum;
    }
}
