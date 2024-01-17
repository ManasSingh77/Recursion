package Recursion;
public class diceNoOfWays {
    public static void main(String[] args) {
        //no. of choices=no. of recursive calls
        // first dice can make move 1,2,3
        int n=4;
        PrintPath(n,0,"");
    }
    public static void PrintPath(int n,int curr,String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }
        for(int dice=1;dice<=3;dice++){
            PrintPath(n,curr+dice,ans+dice);
        }
//        PrintPath(n,curr+1,ans+1);
//        PrintPath(n,curr+2,ans+2);
//        PrintPath(n,curr+3,ans+3);
    }
}