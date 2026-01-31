public class frequency {
    public static void main(String args[]) {
        int[] a = {2, 5, 1, 2, 1, 5, 2, 3};
        boolean[] v = new boolean[a.length];
        int c1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (v[i] == true)
                continue;
            c1=1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c1++;
                    v[j] = true;
                }
                }
            System.out.println(a[i]+"occurs "+ c1+" times");
        }
    }
}