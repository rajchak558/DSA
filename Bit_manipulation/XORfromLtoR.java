package Bit_manipulation;
/*Problem Statement: Given two integers L and R. Find the XOR of the
  elements in the range [L , R].
 Example 1:
Input :
 L = 3 , R = 5
Output :
 2
Explanation :
answer = (3 ^ 4 ^ 5) = 2.

Example 2:
Input :
 L = 1, R = 3
Output :
 0
Explanation :
answer = (1 ^ 2 ^ 3) = 0.*/
public class XORfromLtoR {
    public static void main(String args[]){
        int l=3,r=5;
        int r1=0;
        for(int i=l;i<=r;i++){
            r1^=i;
        }
        System.out.println(r1);
    }
}
