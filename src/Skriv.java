import java.util.ArrayList;
import java.util.List;

public class Skriv {
    static List<String> inputs = new ArrayList<>();

    public static boolean addToList(String input) {
        if (input.equals("stop")) {
            return false;
        } else {
            inputs.add(input.replaceAll("\\s+", "").trim());
            return true;
        }
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

    public static String printLongestWord() {
        if (inputs.size() > 1 ){
        String longestWord = inputs.get(0);
        for (String input : inputs) {
            if (input.length() > longestWord.length()) {
                longestWord = input;
            }
        }
        System.out.println("Längsta ordet: " + longestWord);
        return longestWord;
    }
        return "Du har inte matat in något.";
    }
}