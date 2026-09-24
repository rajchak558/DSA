package Stack;

import java.util.*;

/*perform the operation of tower of hanoi over 3 rods for n disks
* with first rod fully occupied */
public class TowerOfHanoi {
    static Stack<Integer> rod1=new Stack<>();
    static Stack<Integer> rod2=new Stack<>();
    static Stack<Integer> rod3=new Stack<>();
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            rod1.push(i);
        }
        System.out.println(" "+rod1+" "+rod2+" "+rod3);
        hanoi(n,rod1,rod2,rod3);


    }
    public static void hanoi(int n,Stack a,Stack b,Stack c){
        if(n==1){
            c.push(a.peek());
            a.pop();
            System.out.println(" "+rod1+" "+rod2+" "+rod3);
            return;
        }

        hanoi(n-1,a,c,b);
        hanoi(1,a,b,c);
        hanoi(n-1,b,a,c);

    }
}
