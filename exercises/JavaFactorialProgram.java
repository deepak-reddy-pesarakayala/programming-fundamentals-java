import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= n);
        System.out.println(fact);
        scanner.close();
        }
}