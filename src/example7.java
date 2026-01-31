import java.util.Scanner;
public class example7{
    public static void main(String args[]) {
        int[] a= {5,3,9,1,6};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if (a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);

        }
    }

}

