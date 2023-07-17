package opps;

import java.util.Scanner;

public class Racer{
    String action;
    int runScore;
    int jumpScore;
    int crwalScore;
    Racer(String s,int r,int j,int c) {
        action=s;
        runScore=r;
        jumpScore=j;
        crwalScore=c;
    }
    public String goodAt() {
        if(count_j(action)==count_c(action)) {
            return "Perfect";
        }
        else if(count_j(action)>count_c(action)) {
            return "Jumper";
        }
        else if(count_j(action)<count_c(action)) {
            return "Crawler";
        }
        return null;
    }
    int finalScore() {
        return (count_r(action)*runScore)+(count_j(action)*jumpScore)+(count_c(action)*crwalScore);
    }
    int count_j(String action) {
        int count=0;
        for(int i=0;i<action.length();i++) {
            if('j'==action.charAt(i)) {
                count+=1;
            }
        }
        return count;
    }
    int count_c(String action) {

        int count=0;
        for(int i=0;i<action.length();i++) {
            if('c'==action.charAt(i)) {
                count+=1;
            }
        }
        return count;
    }
    int count_r(String action) {

        int count=0;
        for(int i=0;i<action.length();i++) {
            if('r'==action.charAt(i)) {
                count+=1;
            }
        }
        return count;
    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int r=s.nextInt();
        int j=s.nextInt();
        int c=s.nextInt();
        Racer racer=new Racer(str,r,j,c);
        System.out.println(racer.goodAt());
        System.out.print(racer.finalScore());
    }
}
