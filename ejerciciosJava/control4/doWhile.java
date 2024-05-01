package control4;
import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1, n = num, sum = 0;

        // do...while loop
        do {
            sum += i;
            System.out.println(i);
            i++;
        } while(i <= n);
        System.out.println("Sum = " + sum);
           }

}
