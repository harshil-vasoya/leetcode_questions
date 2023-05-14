import java.util.*;

public class trypro {
    final static int MOD = (int) 1e9 + 7;

//    public static void main(String[] args) {
//        int[][] arrry = {{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}};
//        temp(arrry);
//    }
//
//    public static void temp(int[][] arry) {
//        for (int i = 0; i < arry.length; i++)
//            Arrays.sort(arry[i]);
//
//        int ans=0;
//        for(int j=0;j< arry[0].length;j++) {
//            int max=Integer.MIN_VALUE;
//            for (int i = 0; i < arry.length; i++) {
//                if(arry[i][arry[0].length-1-j]>=max)
//                {
//                 max=arry[i][arry[0].length-1-j] ;
//                }
//            }
//            ans+=max;
//        }
//        System.out.println(ans);
//    }
public static void main(String[] args) {
    int[] nums = {2, 1, 4};

    System.out.println(maximumXORAfterKOperations(nums));
}

    private static long maximumXORAfterKOperations(int[] nums) {
        Arrays.sort(nums);

        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum += (long) Math.max(nums[i], nums[j]) * Math.min(nums[i], nums[j]);
            }
        }

        return sum % (1000000007);
    }
}

