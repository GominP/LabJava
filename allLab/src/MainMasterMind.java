//elab-source:MainMasterMind.java
//elab-mainclass:MainMasterMind
import java.util.Scanner;

public class MainMasterMind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentencePlayer1 = input.next();
        String sentencePlayer2 = input.next();

        MasterMind playerGuess = new MasterMind(sentencePlayer1,sentencePlayer2);
        playerGuess.Guess();


    }

}
