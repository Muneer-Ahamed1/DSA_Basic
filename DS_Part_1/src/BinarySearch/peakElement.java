package BinarySearch;
//{ Driver Code Starts
import java.util.*;


/*Complete the function below*/

class code2
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr,int n)
    {
        //add code here.
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(s<e) {
            if(arr[mid]<arr[mid+1]) {
                s=mid+1;
            }
            else {
                e=mid;
            }
            mid=s+(e-s)/2;

        }
        return s;
    }
}