package funciones6;

public class Vocales {
    static void sinVocales(String str) {
        String vogais = "";
        vogais = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String after removing vowel : "+ vogais);
    }

    public static void main(String[] args) {
        sinVocales("ironhack");
    }
}


