import java.util.Scanner;

public class MainPrograme {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Fraction f1 = new Fraction(sc.nextInt(),sc.nextInt());
        Fraction f2 = new Fraction(sc.nextInt(),sc.nextInt());
        Fraction f3 = f1.add(f2);
        System.out.println(f3);

    }
}
