import java.util.Scanner;
public class evenandodd{
    public static void main(String args[]) {
        int[] a = {5, 7, 9, 2, 4};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.println("even number:"+a[i]);
            else
                System.out.println("odd number:" + a[i]);
            }
    }
}