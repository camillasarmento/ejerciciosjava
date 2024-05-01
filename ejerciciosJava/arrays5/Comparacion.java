package arrays5;

import java.util.Arrays;

public class Comparacion {

        // Main driver method
        public static void main(String[] args)
        {

            // Declaring and initializing integer arrays
            // having same values

            // Array 1
            int inarr1[] = { 1, 3, 3 };
            // Array 2
            int inarr2[] = { 1, 2, 3 };

            // Array 1 contains only one element
            Object[] arr1 = { inarr1 };
            // Array 2 also contains only one element
            Object[] arr2 = { inarr2 };

            // outarr1 contains only one element
            Object[] outarr1 = { arr1 };
            // outarr2 also contains only one element
            Object[] outarr2 = { arr2 };

            // Checking if arrays are equal or not
            // using deepEquals() method
            if (Arrays.deepEquals(outarr1, outarr2))

                // Print statement if arrays are same
                System.out.println("Identicos");
            else

                // Print statement if arrays are not same
                System.out.println("No son identicos");
        }
    }

