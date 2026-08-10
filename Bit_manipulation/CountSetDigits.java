package Bit_manipulation;
/*Problem Statement: Given an integer n, return the number of set bits (1s) in its binary representation.
Can you solve it in O(log n) time complexity?*/
public class CountSetDigits {
    public static void main(String args[]){
        int num=625;
        System.out.println(Integer.toBinaryString(num));
        System.out.println("The number of set digits in the decimal given is:"+countSet(num));
    }
    public static int countSet(int num){
        int c=0;
        /* Brian kerninghan algorithm without division O(1)approach
        Step 1: While n is non-zero, turn off the rightmost set bit
        while (n > 0) {
            n &= (n - 1);  // Turn off the rightmost set bit
            count++;  // Increment the count
        }*/
        while(num>0){
            int rem=num%2;
            if(rem==1){
                c++;
            }
            num/=2;
        }
        return c;
    }
}
