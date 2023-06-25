public class leetcode_weekly_348_3 {
    public static void main(String[] args) {
temp(1,12,1,8);
    }
    public static void temp(int n1, int n2,int l1,int l2){

        int ans=0;
        for(int i=n1;i<n2;i++)
        {
            if(sum(i)>=l1 && sum(i)<=l2)
            {
                ans=ans+1;
            }
        }
        System.out.println(ans);
    }
    public static int sum(int number)
    {
        int sum = 0;
        while (number != 0)
        {
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;
    }
}
