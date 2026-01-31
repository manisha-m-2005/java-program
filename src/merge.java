import java.util.Scanner;
public class merge {
    public static void main(String args[]) {
        int[] a = {2,5,1};
        int[] b={1,3,4};
        int[] c=new int[a.length+b.length];
        int k=0;
        for(int i=0; i<a.length; i++) {
            c[k++] = a[i];
        }
            for (int i = 0; i < b.length; i++) {
                c[k++] = b[i];
            }
            for (int i = 0; i < c.length; i++) {

                System.out.print(c[i] +" ");
            }
        }
    }
