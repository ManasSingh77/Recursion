package Recursion;

public class HeadTail {
    public static void main(String[] args) {
        int n=3;
        HeadTail(n,"");
    }
    public static void HeadTail(int n,String ans){
        if(n==0) {
            System.out.println(ans);
            return;
        }
        HeadTail(n-1,ans+ "T");
        if(ans.length()==0||ans.length()>=1&&ans.charAt(ans.length()-1)!='H') {
            HeadTail(n-1,ans+"H");
        }
    }
}
