class find{

    public static int FindKey(int i1,int i2,int i3) {
        int j1=(i1/100)%10;
        int j2=(i2/10)%10;
        int max=0;
        while(i3>0) {
            if(i3%10>max) {
                max=i3%10;
            }
            i3/=10;

        }
        int val=(j1*j2)*max;
        return val;
    }

    public static void main(String arg[]) {

    System.out.println(FindKey(2610,2359,1784));
    }



}