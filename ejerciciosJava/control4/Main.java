/*4. Estructuras de Control:
Escribe un programa que use `if` para comparar dos números e imprimir cuál es mayor o si son iguales.
Implementa un bucle `for` que imprima números del 1 al 10.
Usa un bucle `while` para realizar una cuenta regresiva desde 10 hasta 1.
Desarrolla un programa que pida al usuario un número y utilice un bucle `do-while` para sumar todos los números hasta ese número.
Agrega un ejemplo que use `switch` para realizar diferentes operaciones matemáticas basadas en la entrada del usuario.
*/

package control4;
import java.util.Scanner;


public class Main {

    public static void main(String args[]) {
        // Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;

        // Prompt the user to input the first integer
        System.out.print("Entre el primer numero: ");
        numero1 = input.nextInt(); // Read the first number from the user

        // Prompt the user to input the second integer
        System.out.print("Entre el segundo numero: ");
        numero2 = input.nextInt(); // Read the second number from the user

        // Compare and display the results
        if (numero1 == numero2)
            System.out.printf(numero1 + " + " + numero2 + " = " + "Son iguales");
        if (numero1 < numero2)
            System.out.printf(numero1 + " < " + numero2 + " = " + "El primer numero es menor que el segundo numero");
        /* if (numero1 < numero2)
        System.out.printf(numero2);*/
        if (numero1 > numero2)
            System.out.printf(numero1 + " > " + numero2 + " = " + "El primer numero es mayor que el segundo numero");
              }

}
