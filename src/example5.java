import java.util.Scanner;
public class example5{
    public static void main(String args[]) {
        int[] a = {10, 3, 4, 5, 9, 6};
        int max = a[0];
        int max1=Integer.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max1 = max;
                max = a[i];
            } else if ( a[i] > max1)
                max1 = a[i];
        }
        System.out.println("max=" + max1);

    }
}