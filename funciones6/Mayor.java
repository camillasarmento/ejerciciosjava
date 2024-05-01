package funciones6;

public class Mayor {
    static int getmax(int arr[], int n){
        if(n==1)
            return arr[0];
        return Math.max(arr[n-1], getmax(arr, n-1));
    }
    public static void main(String args[])
    {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.print(getmax(arr, n));
    }
}
