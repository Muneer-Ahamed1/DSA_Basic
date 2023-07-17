import java.util.ArrayList;

class Main{
    String fun1(String str,int num) {
        String rev="";

        String[] arr=str.split(" ");
        if(num==0) {
            for(String i:arr) {
                StringBuilder stringBuilder=new StringBuilder(i);
                for(int j=0,k=stringBuilder.length()-1;j<k;j++,k--) {
                    char c=stringBuilder.charAt(j);
                    stringBuilder.setCharAt(j,stringBuilder.charAt(k));
                    stringBuilder.setCharAt(k,c);
                }
                rev=rev+stringBuilder+" ";
            }

        }

        if(num==1) {
            for (String i:arr) {
                StringBuilder stringBuilder=new StringBuilder(i);
                ArrayList<Character> al=new ArrayList<>();
                al.add('-');
                al.add(';');
                al.add(',');
                al.add('/');

                for(int j=0,k=stringBuilder.length()-1;j<k;j++,k--)  {
                    char a=stringBuilder.charAt(j);
                    char b=stringBuilder.charAt(k);
                    if(Character.isUpperCase(a)) {
                        if (!al.contains(b)) {
                            a = Character.toLowerCase(a);
                            b = Character.toUpperCase(b);
                        }
                    }
                    else {
                        if (Character.isUpperCase(b)) {
                            if (!al.contains(a)) {
                                b = Character.toLowerCase(b);
                                a = Character.toUpperCase(a);
                            }
                        }
                    }
                    stringBuilder.setCharAt(j,b);
                    stringBuilder.setCharAt(k,a);
                }
                rev=rev+stringBuilder+" ";
            }
        }
        rev=rev.trim();

        return rev;
    }

public static void main(String arg[]) {
    Main m=new Main();
    String inp1="Wipro TechNologies, BangaLore";
    int inp2=1;
    System.out.println(m.fun1(inp1,inp2));
}

}
