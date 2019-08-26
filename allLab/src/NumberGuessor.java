//elab-source:NumberGuessor.java
//elab-mainclass:NumberGuessor
import java.util.Scanner;

public class NumberGuessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int numGuess = input.nextInt();

        for (int i = 0 ;i < numGuess;i++){
            int guess = input.nextInt();
            if (guess > target){
                System.out.println("too hight");
            }
            else if (guess < target){
                System.out.println("too low");
            }
            else {
                System.out.println("correct");
                break;
            }

        }
    }
}
