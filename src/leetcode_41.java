import java.util.Arrays;
/*
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

*/
public class leetcode_41 {
    public static void main(String[] args) {
        int[] a={1,2,0};
        System.out.println(firstMissingPositive(a));

    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        removeDuplicates(nums);

        int x = 1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                if(nums[i] != x){
                    return x;
                }
                x++;

            }
        }
        return x;

    }
    public static void removeDuplicates(int[]a){
        int n = a.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
    }

}



