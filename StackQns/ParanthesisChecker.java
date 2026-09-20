package Stack;
/*Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. Determine whether the Expression is balanced or not.
An expression is balanced if:

Each opening bracket has a corresponding closing bracket of the same type.
Opening brackets must be closed in the correct order.Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. Determine whether the Expression is balanced or not.
An expression is balanced if:

Each opening bracket has a corresponding closing bracket of the same type.
Opening brackets must be closed in the correct order.*/
public class ParanthesisChecker {
    static int MAX=10^6;
    public static void main(String args[]){
            String s="([{}])";
            int top=-1;
            char stack[]= new char[MAX];
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                top++;
                stack[top]=c;
                //temp=c;
                if(top>0){
                    if((stack[top]==')' && stack[top-1]=='(') || (stack[top]=='}' && stack[top-1]=='{') || (stack[top]==']' && stack[top-1]=='[')){
                        top=top-2;
                    }
                }
                printstack(stack,top);
                System.out.println("\n"+c);
            }
            if(top==-1){
                System.out.println("Paranthasis is ok");
            }
            else {
                System.out.println("Paranthasis is not ok");
            }
    }
    static void printstack(char[] stack,int top){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
    }
}
