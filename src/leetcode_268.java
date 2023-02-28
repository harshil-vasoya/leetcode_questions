public class leetcode_268 {
    /*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.*/
    /*https://leetcode.com/problems/missing-number/*/
    public static void main(String[] args) {
    int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1)/2 ;
        for (int i = 0 ; i < n ; i ++)
        {
            sum = sum - nums[i] ;
        }
        return sum ;
    }
}
