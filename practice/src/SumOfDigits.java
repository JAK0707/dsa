import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Sum of digits of "+n+"is "+sod(n));
    }
    static int sod(int n){
        return n%10;
    }
}
