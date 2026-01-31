import java.util.Scanner;
public class interchange {
    public static void main(String args[]) {
        int r, c;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row");
        r = in.nextInt();
        System.out.println("enter the coulmn");
        c = in.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("matrix");
        for (int j = 0; j < c; j++) {
            int temp = a[0][j];
           a[0][j]=a[r-1][j];
            a[r-1][j]=temp;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}