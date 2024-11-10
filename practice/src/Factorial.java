import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
    static int factorial(int n){
        if(n<2){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
