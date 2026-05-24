import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        double amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }
        double finalAmount;
        if (type.equals("Gold")) {
            finalAmount = amount - (amount * 30 / 100);
            System.out.println("Final Amount after Discount: " + finalAmount);
        } else if (type.equals("Silver")) {
            finalAmount = amount - (amount * 20 / 100);
            System.out.println("Final Amount after Discount: " + finalAmount);
        } else if (type.equals("Regular")) {
            finalAmount = amount - (amount * 7 / 100);
            System.out.println("Final Amount after Discount: " + finalAmount);
        } else {
            System.out.println("Invalid membership");
        }
    }
}