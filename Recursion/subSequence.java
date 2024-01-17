package Recursion;

public class subSequence {
    public static void main(String[] args) {
              String ques="abc";
            print(ques,"");
            System.out.println("\n"+Count(ques,""));
//            System.out.println(count);

    }
//    static int count=0;
public static int Count(String ques,String ans){
    if(ques.length()==0){
        System.out.println(ans);
        return 1;
    }
    char ch=ques.charAt(0);
    int a=Count(ques.substring(1),ans);
    int b=Count(ques.substring(1),ans+ch);
    return a+b;
}
    public static void print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        print(ques.substring(1),ans);
        print(ques.substring(1),ans+ch);
    }
}
