package funciones6;

public class Par {
    public static boolean parImpar(int num) {
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean isPar=parImpar(10);
        System.out.println(isPar);
    }
}
