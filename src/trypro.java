import java.util.*;

public class trypro {
    final static int MOD = (int)1e9+7;
    public static void main(String[] args) {
        int[] nums={2,3,3,4,6,7};
        int target=12;
        int n= nums.length;
        int[] f = new int[n];
        f[0] = 1;
        for (int i = 1; i < n; i++)
            f[i] = (f[i - 1] << 1) % MOD;
        int l = 0, r = n-1;
        int ans = 0;
        while (l <= r) {
            if (nums[l] + nums[r] > target)
                r--;
            else {
                ans = (ans + f[r - l]) % MOD;
                System.out.println((f[r-l]));
                l++;
            }
        }



    }
}