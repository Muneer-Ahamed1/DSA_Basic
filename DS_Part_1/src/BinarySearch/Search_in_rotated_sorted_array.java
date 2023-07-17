package BinarySearch;
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


//User function Template for Java

class code3
{
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int s=0;
        int pivot=pivot(A,l,h);
        if(A[pivot]<=key&&key<=A[h]) {
            s=binarySearch(A,key,pivot,h);
        }
        else{
            s=binarySearch(A,key,0,pivot-1);
        }
        return s;
    }
    int binarySearch(int[] arr,int key,int s,int e) {
        int mid=(s+e)/2;
        while(s<=e) {
            if(arr[mid]==key) {
                return mid;
            }
            else if(arr[mid]>key) {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=(s+e)/2;
        }
        return -1;
    }
    int pivot(int[] arr,int s,int e) {
        int mid=(s+e)/2;
        while(s<e) {
            if(arr[0]<arr[mid]) {
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=(s+e)/2;
        }
        return s;
    }
}