import java.util.Scanner;
public class rotation {
    public static void main(String args[]) {
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 30,20, 40};
        boolean v=false;
        for (int i = 0; i < a.length; i++) {
            if (b[i] == a[0]) {
                int j;
                for (j = 0; j < a.length; j++) {
                    if (a[j] != b[(i + j) % a.length]) {
                        break;
                    }
                    if (j == a.length) {
                        v = true;
                        break;
                    }
                    if (v)
                        System.out.println("rotation");
                    else
                        System.out.println(" not rotation");
                }
            }
        }
    }
}