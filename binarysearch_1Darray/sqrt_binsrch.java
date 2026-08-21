package binarysearchp_rograms;
import java.lang.Math;
/*Problem Statement: You are given a positive integer n.
Your task is to find and return its square root.
If ‘n’ is not a perfect square, then return the floor value of sqrt(n).
        */
public class sqrt_binsrch {
    public  static void main(String args[]){
        int n=629;
        System.out.println(Math.sqrt(n));
        int square_root=sqrt(n);
        System.out.println("Square root is "+square_root);
    }
    public static int sqrt(int n){
        int root=0;
        int left=0,right=n/2;
        int count=0;

        while(left+1<right){
            int mid=(left+right)/2;
            if(mid*mid==n){
                return mid;

            }
            else if(mid*mid>n){
                right=mid;
            }
            else if  (mid*mid<n) {
                left=mid;
            }
            System.out.println(left+" "+right);
        }
        System.out.println("loop ends");
        return (int)Math.floor(Math.sqrt(n));
    }
}
