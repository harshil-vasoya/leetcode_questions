import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class trypro {
    public static void main(String[] args) {
       int[] arry={
               1,1,2
       };
        List<List<Integer>> ans=permuteUnique(arry);
        System.out.println(ans);
    }
    public static List<List<Integer>>  permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, result, new ArrayList<>());

        return result;
    }
    private static void permuteHelper(int nums[], List<List<Integer>> result, List<Integer> temp){

        if(temp.size() == nums.length){
            if(!result.contains(temp))
            result.add(new ArrayList<>(temp));

            return;
        }


        for(int num: nums){


            temp.add(num);

            permuteHelper(nums, result, temp);

            temp.remove(temp.size()-1);
        }

    }
}