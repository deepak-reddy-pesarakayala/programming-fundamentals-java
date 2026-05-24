import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double costPerDozen = sc.nextDouble();
        int numberOfDozens = sc.nextInt();
        double discountPercent = sc.nextDouble();
        double totalCost = costPerDozen * numberOfDozens;
        double finalAmount = totalCost - (totalCost * discountPercent / 100);
        if (finalAmount == (long) finalAmount) {
            System.out.println((long) finalAmount);
        } else {
            System.out.printf("%.2f", finalAmount);
        }
        sc.close();
    }
}