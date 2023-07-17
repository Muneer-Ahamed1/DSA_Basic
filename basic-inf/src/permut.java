public class permut {

    static void  pattern (int indx,String str,String patt) {
        if(str.length()==0) {
            System.out.println(patt);
            return;
        }

            for(int i=0;i<str.length();i++) {
                char c=str.charAt(i);
                String string=str.substring(0,i) + str.substring(i+1);
                pattern(indx+1,string,c+patt);
            }
        }




    public  static void main(String arg[]) {
        pattern(0,"naruto"," ");

    }
}
