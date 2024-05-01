/* 5. Array y Bucles:
Crea un array de enteros y usa un bucle para sumar todos los valores del array.
Modifica el array anterior para que imprima todos los valores al revés.
Utiliza un bucle `for-each` para buscar el mayor número en el array.
Desarrolla un programa que compare dos arrays de enteros y determine si son idénticos.
Implementa un programa que encuentre el número más pequeño y el más grande en un array.
*/

package arrays5;


public class Main {
public static void main(String[] args) {
    //Initialize array
    int[] arr = new int[]{1, 2, 3, 4, 5};
    int sum = 0;
    //Loop through the array to calculate sum of elements
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    System.out.println("Suma de todos valores del array: " + sum);
    System.out.println("El array en orden revés: ");
    //Loop through the array in reverse order
    for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
                }
    System.out.println("\nEl mayor numero en el array: " + arrayMax(arr));
}

public static int arrayMax (int[] arr) {
    int max = Integer.MIN_VALUE; //initialize max to the smallest integer possible
    for(int element: arr)
        max = Math.max(max, element);
    return max;

}
}

