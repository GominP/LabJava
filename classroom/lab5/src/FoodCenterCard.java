public class FoodCenterCard {
    private double balance;

    private String color;

    public FoodCenterCard(String color) {
        balance = 0;

        this.color = color;
    }
    public void topUp(double money) {
        if (money < 0)
            throw new IllegalArgumentException("money must be positive");
        balance += money;
    }
    public void spend(double purchase) {
        if (purchase > balance)
            throw new IllegalArgumentException("balance is insufficient");
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
