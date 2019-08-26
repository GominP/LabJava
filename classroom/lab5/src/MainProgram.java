public class MainProgram {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle(2,"vv");
//        Car c1 = new Car(4,"honda",4);
//        v1.move();
//        System.out.println("---------");
//        c1.move();
//        System.out.println("---------");
//        c1.move(100);
//        System.out.println("---------");
//        c1.startEngine();
//        Vehicle v1 =  new Car(4,"handa",4);
//        v1.move();
        Blue card = new Blue("blue");
        card.topUp(200);
        System.out.printf(" add "+card.getBalance());
        card.spend(100);
        System.out.println("U have" +card.getPoint()+"Point");

    }
}
