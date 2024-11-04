import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skriv {
    static List<String> inputs = new ArrayList<>();
    static Integer totalChars = 0;


    public static void addToList(String input) {
        inputs.add(input);
    }
    public static void printList(){
        System.out.println(inputs);
    }
    public static void printRowsOfList(){
        System.out.println(inputs.size());
    }

    public static void printCharsOfList(){
        for (String input : inputs) {
            totalChars += input.length();
        }
            System.out.println(totalChars);

    }
}