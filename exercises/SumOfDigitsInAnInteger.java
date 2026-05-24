import java.util.Scanner; 
public class Solution{ 
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    int number = scanner.nextInt();
    int sum = 0;
    if (number == 0) {
        System.out.println(0);
        return;
    }
    while(number != 0) {
        sum += number % 10;
        number = number /10;
    }
    System.out.println(sum);
    scanner.close();   
    }
}