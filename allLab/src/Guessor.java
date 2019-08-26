//elab-source:Guessor.java
public class Guessor {
    private int target;

    public Guessor(int target) {
        this.target = target;
    }


    public void GuessNumber(int guess){
        if (guess > target){
            System.out.println("too hight");

        }
        else if (guess < target){
            System.out.println("too low");
        }
        else {
            System.out.println("correct");

        }
    }
}
