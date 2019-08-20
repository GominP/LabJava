package sample;

public class GameController {
    private Monster m1, m2;
    private int turn; // -1 , 1
    private int round;



    public GameController(Monster m1, Monster m2){
        this.m1 = m1;
        this.m2 = m2;
        this.turn = 1;
        this.round = 1;


    }
    public void attackState(){
        if (getTurn() > 0){
            m1.Attack(m2);
            System.out.println("Already Attack1");
        }
        else {
            m2.Attack(m1);
            System.out.println("Already Attack2");

        }
        changeTurn();



    }
    public void healState(int h){
        if (getTurn()> 0){
            m1.HealMon(m1,h);
            System.out.println("Already Heal 1");

        }
        else {
            m2.HealMon(m2,h);
            System.out.println("Already Heal 2");

        }
        changeTurn();



    }
    public boolean isWin(){
        if (m1.isDead() || m2.isDead()){
            return true;
        }
        return false;
    }



    public Monster getWinMonster(){
        if (m1.getHp() >= m2.getHp()){
            return m1;
        }
        return m2;
    }
    public void changeTurn(){ this.turn *= -1; }

    public int getTurn() { return turn; }

    public int getRound() { return round; }

}
