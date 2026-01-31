import java.util.Scanner;
public class sumofcolumn {
    public static void main(String args[]){
        int r,c;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the row");
        r=in.nextInt();
        System.out.println("enter the coulmn");
        c=in.nextInt();
        int[][]a=new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            sum=0;
            for (int j = 0; j <c; j++) {
                sum += a[j][i];
            }
            System.out.println("sum of column " + sum);
        }
    }
}

