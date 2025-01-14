//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().minSubset(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution { 
    int minSubset(int[] Arr) { 
        int N = Arr.length;
        Arrays.sort(Arr);
        long rest = 0L;
        int count = 0;
        for(int i=N-1; i>=0; i--){
            long sum = 0L;
            for(int j=0; j<i; j++)
            {
                sum = (sum + Arr[j]);
            }
            rest = (rest + Arr[i]);
            count++;
            if(rest>sum )
            {
                return count;
            }
        }
        return count;
    }
}