import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codefest_2 {
    public static void main(String[] args) {
       int[] a={1,3};
       int[] b={2};
       int n1=a.length;
       int n2=b.length;
       int[] c=new int[n1+n2];
       int f=n1+n2;
       int temp=0;
       for(int i=0;i<n1;i++)
       {
           c[temp++]=a[i];
       }
        for(int i=0;i<n2;i++)
        {
            c[temp++]=b[i];
        }
        Arrays.sort(c);
        System.out.println(f);
        if(f%2==0)
        {
            System.out.println((double)((c[(f-1)/2]+c[((f-1)/2)+1])/2));

        }
        else
        {
            System.out.println( c[(f-1)/2]/2);
        }

    }


}
