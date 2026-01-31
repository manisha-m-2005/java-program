import java.util.Scanner;
public class delete {
    public static void main(String args[]) {
        int[] a = {5, 3, 9, 1, 6};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the position to delete:");
        int n = in.nextInt();
        if (n < 0 || n >= a.length) {
            System.out.println("invalid position");
        } else {
            for (int i = n - 1; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            for (int i = 0; i < n; i++) {
                System.out.println(a[i] + " ");
            }
        }
    }
}