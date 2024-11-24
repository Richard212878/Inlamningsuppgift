import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runWithScanner(scanner);
    }
        public static void runWithScanner(Scanner scanner) {
            String input = "";

        while (!input.equals("stop")) {
            System.out.println("Skriv ett ord. Blanksteg accepteras ej och kommer tas bort från inmatning." +
                    " Inmatning upprepas fram tills du skriver 'stop'.");
            input = scanner.nextLine().replaceAll("\\s+","").trim();
            if (!input.equals("stop")) {
                Skriv.addToList(input);
            }

        }
        scanner.close();
        Skriv.printList();
        Skriv.printRowsOfList();
        Skriv.printCharsOfList();
        Skriv.printLongestWord();
    }

}