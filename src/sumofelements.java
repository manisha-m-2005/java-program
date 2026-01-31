import java.util.Scanner;
public class sumofelements {
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
                sum+=a[i][j];
            }
        }
        System.out.println("sum of elements:"+ sum);
    }
}
