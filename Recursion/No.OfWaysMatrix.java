package Recursion;

public class No.OfWaysMatrix {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        Ways(m,n,"",0,0);
    }
    public static void Ways(int m,int n,String ans,int a,int b){
        if(a>=m||b>=n){
            return;
        }
        if(a==m-1&&b==n-1){
            System.out.println(ans);
            return;
        }
        Ways(m,n,ans+"H",a+1,b);
        Ways(m,n,ans+"V",a,b+1);
    }
}
