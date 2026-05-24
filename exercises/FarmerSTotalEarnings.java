import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double pricePerKg = sc.nextDouble();
            if (sc.hasNextInt()) {
                int quantitySold = sc.nextInt();
                double totalEarnings = pricePerKg * quantitySold;
                System.out.printf("%.2f\n", totalEarnings);
            }
        }
        sc.close();
    }
}