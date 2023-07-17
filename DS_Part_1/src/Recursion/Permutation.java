package Recursion;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();

        }
    }
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        if(S.length()==0) {
            ArrayList<String> ben=new ArrayList<>();
            ben.add("");
            return ben;
        }
        ArrayList<String> ans=new ArrayList<>();


        for(int i=0;i<S.length();i++) {
            char c=S.charAt(0);
            String sub=S.substring(0,i)+S.substring(i+1);
            List<String> arr=  find_permutation(sub);
            for(String j:arr) {
                ans.add(c+j);
            }
            //return ans;
        }
        return ans;
    }
}