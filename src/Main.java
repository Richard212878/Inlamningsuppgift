import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        boolean aktiv  = true;
        while (aktiv) {
            System.out.println("Skriv ett ord. Blanksteg accepteras ej och kommer tas bort från inmatning." +
                    " Inmatning upprepas fram tills du skriver 'stop'.");
            input = scanner.nextLine();
            aktiv = Skriv.addToList(input);


        }
        scanner.close();
        Skriv.printList();
        Skriv.printRowsOfList();
        Skriv.printCharsOfList();
        Skriv.printLongestWord();
    }

}