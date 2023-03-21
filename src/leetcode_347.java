import java.util.*;

public class leetcode_347 {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int[] ans=topKFrequent(arr,2);
        for (int i=0;i<2;i++)
        {
            System.out.println(ans[i]);
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        int arr[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            a.add(e.getValue());
        }

        Collections.sort(a);
        if (a.size()==1) {
            arr[0] = map.get(a.get(0));
            return arr;
        }

        int j=0;
        for(int i=a.size()-1;i>=a.size()-k;i--)
        {
            arr[j++]=map.get(a.get(i));
        }
        return arr;
    }
}
