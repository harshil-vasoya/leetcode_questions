import java.util.Arrays;

public class leetcode_179 {
    public static void main(String[] args) {
        int[] nums={3,30,34,5,9};
        String Ans=LargestNumber(nums);
        System.out.println(Ans);

    }
    public static String LargestNumber(int[] nums)
    {
        String[]arr = new String[nums.length];
        String ans="";
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a, b)->((b+a).compareTo(a+b)));
        for(int i=0;i< arr.length;i++)
        {
         ans+=arr[i];
        }
        return  ans;
    }
}
