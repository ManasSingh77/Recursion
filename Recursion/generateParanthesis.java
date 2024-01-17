package Recursion;

public class generateParanthesis
{
    public static void main(String[] args) {
        int n=3;
        Parentheses(n,0,0,"");
    }
    public static void Parentheses(int n,int open,int close,String ans){
        if(open==n&& close==n){
            System.out.println(ans);
            return;
        }
        if(open>n||close>open){
            return;
        }
        Parentheses(n,open+1,close,ans + "(");
        Parentheses(n,open,close+1,ans+")");

    }
}
