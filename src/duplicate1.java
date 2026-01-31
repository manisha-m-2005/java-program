public class duplicate1 {
    public static void main(String args[]) {
        int[] a = {1,3,4,2,1,3,3,5,7,5};
        boolean[] v = new boolean[a.length];
        int c1 = 0,c2=0;
        for (int i = 0; i < a.length; i++) {
            if (v[i] == true)
                continue;
            c1=0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c1 += 1;
                    v[j] = true;
                }
            }
            if (c1 >= 2)
                c1 = 1;
            c2 = c1 +c2;
        }
        System.out.println(c2);
    }
}