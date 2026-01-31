import java.util.Scanner;
public class unique {
    public static void main(String args[]) {
        int[] a = {2, 5, 1, 2, 1, 5, 2, 3};
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                }
            if (count==1){
                System.out.println(a[i]);
            }
        }
    }
}