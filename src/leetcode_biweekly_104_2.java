import java.util.Arrays;

public class leetcode_biweekly_104_2 {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        int[][] arrry = {{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}};
        temp(arrry);
    }

    public static void temp(int[][] arry) {
        for (int i = 0; i < arry.length; i++)
            Arrays.sort(arry[i]);

        int ans=0;
        for(int j=0;j< arry[0].length;j++) {
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < arry.length; i++) {
                if(arry[i][arry[0].length-1-j]>=max)
                {
                    max=arry[i][arry[0].length-1-j] ;
                }
            }
            ans+=max;
        }
        System.out.println(ans);
    }
}
