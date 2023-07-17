import java.util.Scanner;

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Reading total number of testcases
        int t= sc.nextInt();

        while(t-- >0)
        {
            //reading the string
            String st = sc.next();

            //calling ispar method of Paranthesis class
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        String[] str=x.split("");
        Stack<String> st=new Stack<>();
        for(String i:str) {
            if(i=="{" || i=="[" || i=="(") {
                st.push(i);
            }
            else{
                if(st.peek()=="{" && i=="}") {
                    st.pop();
                }


                if(st.peek()=="[" && i=="]") {
                    st.pop();
                }

                if(st.peek()=="(" && i==")") {
                    st.pop();
                }
                System.out.println(st);


            }
        }
        return st.isEmpty();
    }




    public static void main(String arg[]) {
        String str="{[()]}";
        System.out.println(ispar(str));
    }







}
