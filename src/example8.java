import java.util.Scanner;
public class example8 {
    public static void main(String args[]) {
        int[] a = {3, 9, 12, 14, 21};
        int i, j,temp;
        for (i = a.length-1, j= 0; i>0; i--, j++) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }
}