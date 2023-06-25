import java.util.Arrays;

public class coding_ninjas {
    public static int solve(int[] v, int len) {
        Arrays.sort(v);
        int diff = 0;

        for (int i = len - 2; i >= 0; i--) {
            diff += (v[len - 1] - v[i]);
        }

        if (diff % 2 == 0 || len % 2 == 1) {
            if (diff % 2 == 0)
                return diff / 2;
            return (diff + len) / 2;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] v = {3,5,4,2};
        int len = v.length;
        int result = solve(v, len);
        System.out.println("Result: " + result);
    }
}