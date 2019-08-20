package sample;

public class Monster {
    private String name;
    private int hp;
    private int atk;
    private int def;
    private int maxhp;
    private String imgPath;
    private boolean isDead = true;
    private int skill = 1;

    public Monster(String name, int hp, int atk, int def,String imgPath) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.maxhp = hp;
        this.imgPath = imgPath;


    }


    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public int getMaxhp(){ return maxhp; }
    public int getSkill() { return skill; }

    public String getImgPath() { return imgPath; }

    public String getHealImg(){return "/images/v3.gif";}

    public void setSkill() { this.skill *= -1; }
    public void setImgPath(String imgPath) { this.imgPath = imgPath; }

    public boolean isDead() { return isDead; }

    @Override
    public String toString() {
        return "Monster " +name+
                " atk : " +atk+
                " def : " +def+
                " hp : " +hp+"/"+maxhp;
    }
    public String toStringHp(){
        return "HP : "+getHp()+"/"+getMaxhp();
    }

    public  void Attack(Monster other){
        if(other.getDef() > atk) {
            other.hp -= 0;
        }
        else {
            other.hp = (other.hp+other.getDef())-atk ;
        }
        if (other.hp <= 0){
            other.hp = 0;
        }
    }


    public  void HealMon(Monster self,int monHp){
            self.hp += monHp;
            if (self.hp > self.maxhp){
                self.hp = self.maxhp;
            }
        }

    }


