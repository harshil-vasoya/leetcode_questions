public class leetcode_238 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int n = a.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * a[i - 1];
            System.out.println(res[i]);
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= a[i];
            System.out.println(res[i]);
        }
    }

}
