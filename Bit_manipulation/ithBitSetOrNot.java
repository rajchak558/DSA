package Bit_manipulation;
/*Problem Statement: Given two integers n and i, return true if the ith bit
in the binary representation of n (counting from the least significant bit,
0-indexed) is set (i.e., equal to 1). Otherwise, return false.

Examples
Example 1:
Input:
n = 5, i = 0
Output:
true
Explanation:
Binary representation of 5 is 101. The 0-th bit from LSB is set (1).

Example 2:
Input:
n = 10, i = 1
Output:
true
Explanation:
Binary representation of 10 is 1010. The 1-st bit from LSB is set (1).*/
public class ithBitSetOrNot {
    public static void main(String args[]){
        int num=10;
        //int bin=deciToBinary(num);
        //System.out.println(bin);
        System.out.println("The ith bit is set:"+checkSet(num,2));
    }
    public static int deciToBinary(int decimal){
        int bin=0,i=0;
        while(decimal>0){
            int rem=decimal%2;
            bin+=(int)(Math.pow(10,i))*rem;
            System.out.print(decimal+" "+rem+" "+i+" "+bin+"\n");
            i++;
            decimal/=2;
        }
        return bin;
    }
    public static boolean checkSet(int decimal,int i){
        int bin=deciToBinary(decimal);

        String s=Integer.toString(bin);
        if(i>s.length()+1){
            return false;
        }
        return s.substring(i-1,i).equals("1");
    }
}
