import java.util.Scanner;
public class contigious {
    public static void main(String args[]) {
        int[] a = {3, 2, 4, 2, 4, 1, 1};
        int k, sum = 0, l = 0, len = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number:");
        k = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum == k) {
                    l = j - i + 1;
                }
            }
        }
        System.out.println(l);
    }
}
