import java.util.Scanner;
public class example4 {
    public static void main(String args[]) {
        int[] a = {10, 7, 4, 5, -9, 6};
        int min = a[0];
        int min1 = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
               min1=min;
                min = a[i];
            }
       else if(a[i]<min1)
            min1 = a[i];
            }
        System.out.println("minimum=" + min1);

    }
}