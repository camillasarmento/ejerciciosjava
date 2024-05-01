package holaMundo1;

import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + "!");
        int counter = 0;
    while(counter<2) {
        System.out.println("Hola " + nombre + "!");
        counter ++;
    }
        System.out.println("\n");
        System.out.println("Como estás?");
        String phrase = sc.nextLine();
        System.out.println("Estás se sentindo" + " " + phrase + "?");
sc.close();
    }
}

