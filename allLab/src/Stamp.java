//elab-source:Stamp.java
//elab-mainclass:Stamp
import java.util.Scanner;

public class Stamp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int allItems = input.nextInt();
        double total = 0;
        for(int i = 0 ; i < allItems; i++ ){
            double price = input.nextDouble();
            total += price;
        }
        double allStamp = total/50;

        System.out.println((int)allStamp);
    }
}
