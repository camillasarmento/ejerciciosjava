/* 3. Operaciones Básicas:
Realiza y muestra el resultado de operaciones básicas (suma, resta, multiplicación, división).
Añade operaciones de módulo y elevación a potencia.
Crea un calculador simple que acepte entradas del usuario y realice estas operaciones.
Implementa un sistema simple para calcular el promedio de cinco números ingresados por el usuario.
*/

package operaciones3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double numero1, numero2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Elige un operador: +, -, *, / , ^ or % ");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Entre el primer numero");
        numero1 = input.nextDouble();

        System.out.println("Entre el segundo numero");
        numero2 = input.nextDouble();

        switch (operator) {

            // suma
            case '+':
                result = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + result);
                break;

            // resta
            case '-':
                result = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + result);
                break;

            // multiplicación
            case '*':
                result = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2 + " = " + result);
                break;

            // división
            case '/':
                result = numero1 / numero2;
                System.out.println(numero1 + " / " + numero2 + " = " + result);
                break;
            // módulo
            case '%':
                result = numero1 % numero2;
                System.out.println(numero1 + " % " + numero2 + " = " + result);
                break;
            // elevación a potencia
            case '^':
                result = (Math.pow(numero1, numero2));
                System.out.println(numero1 + " ^ " + numero2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
