import java.util.Scanner;
public class matrixmulti {
    public static void main(String args[]) {
        int r, c;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row");
        r = in.nextInt();
        System.out.println("enter the coulmn");
        c=in.nextInt();
        int[][] a = new int[r][c];
        int[][] b=new int[r][c];
        int [][]sum=new int[r][c];
        System.out.println("Matrix1");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix2");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            for (int j=0; j<c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Matrix Add");
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
