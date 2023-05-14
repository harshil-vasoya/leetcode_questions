import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leecode_biweekly_104_3 {
    static List<List<Integer>> temp=new ArrayList<>();
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {                List<Integer> curr=new ArrayList<>();

            for (int j=0; j<r; j++) {
                curr.add(arr[j]);
            }
            temp.add(curr);
            return;
        }


        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }

    /*Driver function to check for above function*/
    public static void main (String[] args) {
        int arr[] = {1,2,4};
        for(int r=1;r<=arr.length;r++) {
            int n = arr.length;
            printCombination(arr, n, r);
        }
        System.out.println(temp);
        for(int i=0;i<temp.size();i++)
        {

            List<Integer> cuur=temp.get(i);
            Collections.sort(cuur);
            System.out.println(cuur.get(0)+" "+cuur.get(cuur.size()-1));
        }
    }
}
