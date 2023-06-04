public class leetcode_weekly_348 {
    public static void main(String[] args) {
    int[][] q={{0,0,1},{1,2,2},{0,2,3},{1,0,4}};
    temp(q,3);
    }
    public static void temp(int[][] quries , int n)
    {

    }
    public static void temp2(int t,int idex ,int val, int[][] q ,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(t==0)
            {
                q[idex][i]=val;
            }
            else
            {
                q[i][idex]=val;
            }
        }
    }
    public static int prrint(int[][]q , int n)
    {
        int finalans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                finalans+=q[i][j];
            }
        }
        return finalans;

    }
}
