import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode_weekly_345 {
    public  static int[] circularGameLosers(int n, int k) {
        int i = 1;
        int x = 1;

        List<Integer> v = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();

        while (m.getOrDefault(i, 0) == 0) {
            m.put(i, 1);
            i += x * k;
            i--;
            i %= n;
            i++;
            x++;
        }

        for (int j = 1; j <= n; j++) {
            if (m.getOrDefault(j, 0) == 0) {
                v.add(j);
            }
        }
        int[] ans=new int[v.size()];
        for(int j=0;j<v.size();j++)
        {
            ans[i]=v.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;

    }
}
