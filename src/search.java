import java.util.Scanner;
public class search {
    public static void main(String args[]) {
        int[] a = {5, 3, 9, 1, 6};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the element to search");
        int n = in.nextInt();
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.println("element will be found" + a[i]);
                found = true;
            } else {
                System.out.println("element not found");
            }
        }
    }

}