package datos2;

public class Celsius {

    public static void main (String args[]){
        float Fahrenheit, Celsius;
        Fahrenheit = 40;
        Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println("La temperatura en Celsius es: "+Celsius);

  }
}

/*   { float Fahrenheit, Celsius;
        Celsius = 40;
        Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("La temperatura en Fahrenheit es: "+Fahrenheit);
}*/