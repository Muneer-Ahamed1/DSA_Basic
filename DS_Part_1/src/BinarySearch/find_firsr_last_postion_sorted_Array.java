package BinarySearch;


//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);

            int arr[] = new int[(int)(n)];

            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }

            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x);

            for (Integer val: ans)
                System.out.print(val+" ");
            System.out.println();
        }
    }
}




// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        int left=leftMost(arr,x);
        int right=rightMost(arr,x);
        if(right==-1 && left==-1)  {
            ans.add(-1);
            return ans;
        }
        ans.add(left);
        ans.add(right);
        return ans;

    }
    public int leftMost(int[] arr,int x) {
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e) {
            if(arr[mid]==x) {
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]<x) {
                s=mid+1;
            }
            else if(arr[mid]>x) {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }



    public int rightMost(int[] arr,int x) {
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e) {
            if(arr[mid]==x) {
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]<x) {
                s=mid+1;
            }
            else if(arr[mid]>x) {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }



}

