import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MagicWord mg = new MagicWord();

        Scanner inputValue = new Scanner(System.in);


        while (!mg.isWinner()){
            System.out.println("Enter a letter");
            char letter = inputValue.next().toLowerCase().charAt(0);
            mg.checkLettersOfWord(letter);
            mg.incrementAttemps();
            System.out.println(mg.toString());
        }
        System.out.println("You get it in " + mg.getAttemps() + "!");
    }
}
