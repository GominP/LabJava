public class Green extends FoodCenterCard {
    public Green(String color) {
        super(color);
    }
    public void topUp(double money){
        super.topUp(money);
        if (money >= 200){
            super.topUp(((int) (money / 200)) * 10);
//            setBalance(getBalance()+((int) (money / 200)) * 10);
        }
        super.topUp(money);
    }


}
