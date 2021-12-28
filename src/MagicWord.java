import java.util.*;
public class MagicWord {

    private static final String[] arrayOfWords = {"cat","programming", "java", "faith", "future", "coffee"};
    private Boolean[] guessedLetters;
    private String wordToPlay;
    private int attemps = 0;

    // constructors
    public MagicWord(){
        int words = arrayOfWords.length;
        int position = (int) (Math.random() * words);
        wordToPlay = arrayOfWords[position];
        initializeWordSelected();
    }

    public int getAttemps() {
        return attemps;
    }

    private void initializeWordSelected(){
        guessedLetters = new Boolean[wordToPlay.length()];
        for (int i = 0; i < guessedLetters.length; i++){
            guessedLetters[i] = false;
        }
    }

    public void checkLettersOfWord(char letter){
        for (int i = 0; i < wordToPlay.length(); i++){
            if (letter == wordToPlay.charAt(i)){
                guessedLetters[i] = true;
            }
        }
    }

    @Override
    public String toString(){
        String finalWord = "";
        for (int i = 0; i < wordToPlay.length(); i++){
            if (guessedLetters[i]){
                finalWord += wordToPlay.charAt(i);
            } else {
                finalWord += "_";
            }
        }
        return "Attempt " + attemps + ": " + finalWord;
    }

    public void incrementAttemps(){
        attemps++;
    }

    public boolean isWinner(){
        for (int i = 0; i < guessedLetters.length; i++){
            if (guessedLetters[i] == false){
                return false;
            }
        }
        return true;
    }



}
