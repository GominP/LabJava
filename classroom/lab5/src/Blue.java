public class Blue extends FoodCenterCard {
    private int point;
    public Blue(String color) {
        super(color);
        this.point = 0;
    }

    public void spend(double purchase){
        super.spend(purchase);
        point += ((int) (purchase / 50)) * 2;

    }
    public void usePoint(int point){
        if (point > this.point)
            throw new IllegalArgumentException("point is insufficient");
        else {
            this.point -= point;
        }

    }

    public int getPoint() {
        return point;
    }
}
