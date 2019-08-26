//elab-source:MasterMind.java

public class MasterMind {
    private String player1;
    private String player2;
    private int digits;
    private int positions;

    public MasterMind(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.digits = 0;
        this.positions = 0;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public int getDigits() {
        return digits;
    }

    public int getPositions() {
        return positions;
    }

    public void Guess(){
        for (int i = 0 ;i < 4;i++){
            if (player1.charAt(i) == player2.charAt(i)){
                this.positions += 1;
            }
        }
        for (int i = 0 ;i < 4;i++){
            for (int j = 0 ;j < 4;j++){
                if (player1.charAt(i) == player2.charAt(j)){
                    this.digits += 1;
                }
            }
        }
        if (this.digits == 4 && this.positions == 4){
            System.out.println("Congratulations, you just mastered my mind!!");
        }
        else {
            System.out.println(getDigits()+" "+getPositions());
        }
    }
}
