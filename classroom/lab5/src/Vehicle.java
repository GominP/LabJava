public class Vehicle {
    private int passenger;
    private String  brand;

    public Vehicle(int passenger, String brand) {
        this.passenger = passenger;
        this.brand = brand;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public void  move(){
        System.out.println("Move from super");
    }



}
