package funciones6;
import java.lang.*;

public class inverter {
    static void inverterCadena(String a) {
        char[] cadena = a.toCharArray();

        for (int i = cadena.length - 1; i >= 0; i--)
            System.out.print(cadena[i]);
    }

    public static void main(String[] args) {
        inverterCadena("ironhack");
    }
}

