package arrays5;

public class mayorMenor {

    public static void main(String[] args) {

        //numeros array
        int numeros[] = new int[]{55,32,45,98,82,11,9,39,50};

        //assign first element of an array to mayor and menor
        int menor = numeros[0];
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor)
                mayor = numeros[i];
            else if (numeros[i] < menor)
                menor = numeros[i];
        }

        System.out.println("El mayor numero del array es : " + mayor);
        System.out.println("El menor numero del array es : " + menor);
    }
}

