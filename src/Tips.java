import java.util.*;

public class Tips {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter a subtotal and gratuity rate");

        // ask user for the subtotal and gratuity rate
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // calculate the gratuity and total
        double gratuity = (gratuityRate / 100) * subtotal;
        double total = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity + " and the total is $" +  total);
    }
}
