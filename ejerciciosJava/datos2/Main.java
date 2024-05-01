/* 2. Variables y Tipos de Datos:
Declara e inicializa variables de diferentes tipos (int, double, String).
Imprime estas variables.
Realiza y muestra conversiones entre tipos de datos (casting).
Escribe un programa que calcule y muestre el área de un rectángulo usando variables para los lados.
Crea un programa que convierta grados Fahrenheit a Celsius y viceversa.
*/

package datos2;

public class Main {
    public static void main(String[] args) {
        int numero = 9;
        System.out.println(numero);
        double precio = 8.5;
        System.out.println(precio);
        String palabra = "paraula";
        System.out.println(palabra);

        double myDouble = numero; // Automatic casting: int to double
        System.out.println(numero);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

    }

}

