import java.util.Scanner;
public class user {
    public static void main(String args[]){
        int[][]a=new int[3][];
        int r,c;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the row");
        r=in.nextInt();
        for(int i=0;i<r;i++)
        {
            System.out.println("enter the coulmn");
            c=in.nextInt();
            a[i]=new int[c];
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
System.out.println("Matrix");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
