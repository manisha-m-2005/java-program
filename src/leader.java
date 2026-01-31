public class leader {
    public static void main(String args[]) {
        int[] a = {8,9,10,6,5};
        for (int i =0;i<a.length-1; i++) {
            boolean v=true;
            for(int j=i+1;j<a.length;j++) {
                if (a[i] < a[j]) {
                    v = false;
                    break;
                }
            }
            if(v)
                        System.out.println("leader:" + a[i]);
                    }
                }
        }