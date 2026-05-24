import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid input");
        }
        else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle");
        }
        else if (a == b && b == c) {
            System.out.println("Equilateral");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }
        sc.close();
    }
}