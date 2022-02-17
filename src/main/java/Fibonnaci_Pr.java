import java.util.Scanner;

public class Fibonnaci_Pr {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {

        int n, first = 0,next = 1;

        System.out.println("Enter how many fibonnaci numbers to print");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        //System.out.print(first + " , " + next);

        for (int i = 1; i<=n; ++i)
        {

            System.out.print(first + " , ");
            int sum = first + next;
            first = next;
            next = sum;
            //System.out.print(" " + sum);
        }
        System.out.println("\nThe sum of "+n+" is: "+ fib(n));
    }
}
