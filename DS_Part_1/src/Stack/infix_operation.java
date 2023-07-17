package Stack;

import java.io.*;
import java.util.*;

 class a {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean bool=false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c=='(' || c=='[' || c=='{') {
                st.push(c);
            }
            else if(c=='+' || c=='-' || c=='/' || c=='*') {
                st.push(c);
            }
            else {
                if(c==')') {
                    bool = false;
                    c = st.peek();
                    while (c != '(' ) {
                        if(st.isEmpty()) {
                            System.out.println(false);
                            return;
                        }

                        if (c == '+' || c == '-' || c == '/' || c == '*') {
                            bool = true;
                        }
                        st.pop();
                        c = st.peek();
                       // System.out.println(st.peek());
                    }
                    st.pop();
                }
                if(c==']') {


                    while ( c != '[' ) {
                        if(st.isEmpty()) {
                            System.out.println(false);
                            return;
                        }

                        if (c == '+' || c == '-' || c == '/' || c == '*') {
                            bool = true;
                        }
                        st.pop();
                        c = st.peek();
                        System.out.println(st.peek());
                    }
                    st.pop();
                }
                if(c=='}') {


                    while ( c != '{') {
                        if(st.isEmpty()) {
                            System.out.println(false);
                            return;
                        }

                        if (c == '+' || c == '-' || c == '/' || c == '*') {
                            bool = true;
                        }
                        st.pop();
                        c = st.peek();


                    }
                    st.pop();

                }
            }

        }


            System.out.println(bool);
     return ;
    }
}