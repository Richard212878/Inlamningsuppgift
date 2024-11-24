import java.util.ArrayList;
import java.util.List;

public class Skriv {
    static List<String> inputs = new ArrayList<>();




    public static void addToList(String input) {
        inputs.add(input);
    }
    public static void printList(){
        System.out.println(String.join(" ", inputs));
    }
    public static int printRowsOfList(){
        System.out.println(inputs.size());
        return inputs.size();
    }

    public static int printCharsOfList(){
        int totalChars = 0;
        for (String input : inputs) {
            totalChars += input.length();
        }
        System.out.println(totalChars);
        return totalChars;
    }

    public static void printLongestWord() {
        String longestWord = inputs.getFirst();
        for (String input : inputs) {
            if (input.length() > longestWord.length()) {
                longestWord = input;
            }
        }
        System.out.println("Längsta ordet: " + longestWord);
    }
}