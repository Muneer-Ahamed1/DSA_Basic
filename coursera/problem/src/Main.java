public class Main {

    int  count(int input1,int input2) {
        int c=0;
        for(int i=1;i<=input2;i++) {
            if(i%input1==0) {
                c+=1;
            }

        }
        return c;
    }





    public static void main(String[] args) {
	/*int input1=3521;
    int input2=2452;
    int input3=1352;*/
        Main m=new Main();
        System.out.println(m.count(2,20));


    }
}