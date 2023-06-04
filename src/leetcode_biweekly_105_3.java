import java.util.Arrays;
import java.util.List;

public class leetcode_biweekly_105_3 {
    public static void minimizeString(int[] nums) {
//        int n = s.length;
//        int firsti = 0;
//        int lasti = 0;
//        for (int i = 0; i < n; i++) {
//            if (s[i] == 1) {
//                firsti = i ;
//            }
//            if (s[i] == n) {
//                lasti = i;
//            }
//
//        }
//
//        System.out.println(n-lasti-1+firsti);
//        if(firsti>lasti)
//        {
//            System.out.println(n-firsti+lasti);
//        }
//        System.out.println(firsti);
//        System.out.println(lasti);
        int n = nums.length;
        int first = 1;
        int last = n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == first) {
                first++;
            } else if (nums[i] == last) {
                last--;
            } else {
                int j = i + 1;
                while (j < n && nums[j] != first) {
                    j++;
                }
                if (j < n) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);

    }



    public static void main(String[] args) {
        int[] temp={2,4,1,3};
        minimizeString(temp);
    }
}
