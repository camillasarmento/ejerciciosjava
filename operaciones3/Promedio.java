package operaciones3;
import java.util.Scanner;

public class Promedio {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner in = new Scanner(System.in);

            // Prompt the user to input the first number
            System.out.print("Entre el primer numero: ");

            // Read and store the first number
            int num1 = in.nextInt();

            // Prompt the user to input the second number
            System.out.print("Entre el segundo numero: ");

            // Read and store the second number
            int num2 = in.nextInt();

            // Prompt the user to input the third number
            System.out.print("Entre el tercer numero: ");

            // Read and store the third number
            int num3 = in.nextInt();

            // Prompt the user to input the fourth number
            System.out.print("Entre el cuarto numero: ");

            // Read and store the fourth number
            int num4 = in.nextInt();

            // Prompt the user to input the fifth number
            System.out.print("Entre el quinto numero: ");

            // Read and store the fifth number
            int num5 = in.nextInt();

            // Calculate and print the average of the five numbers
            System.out.println("El promedio de los cinco numeros es: " + (num1 + num2 + num3 + num4 + num5) / 5);

    }
}
