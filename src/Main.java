import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";



        while (!input.equals("stop")) {
            System.out.println("skriv");
            input = scanner.nextLine();
            if (!input.equals("stop")) {
                Skriv.addToList(input);
            } else {
            }

        }
        scanner.close();
        Skriv.printList();
        Skriv.printRowsOfList();
        Skriv.printCharsOfList();
    }

}