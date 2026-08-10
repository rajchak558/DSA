package Bit_manipulation;
/*
* Problem Statement: Given two integers start and goal. Flip the minimum
* number of bits of start integer to convert it into goal integer.

A bits flip in the number val is to choose any bit in binary representation
* of val and flipping it from either 0 to 1 or 1 to 0.
*Example 1:
Input :
start = 10 , goal = 7
Output :
 3
Explanation :
 The binary representation of 10 is "1010". The binary representation of 7
 is "111". If we flip the underlined bits in binary representation of 10
 then we will obtain our goal.

Example 2 :
Input :
 start = 3 , goal = 4
Output :
 3
Explanation :
 The binary representation of 3 is "011".The binary representation of 4 is
 "100". So if we flip all the three bits of 3 then we will reach our goal
 number.
*/
public class NumberOfBitsToBeFlipped {
    public static void main(String args[]){
        int start=7;
        int end=36;

        int rem1=0,rem2=0;
        int result=0;
        while(start!=0 || end!=0){
            rem2=end%2;
            end/=2;

            if(start!=0){
                rem1=start%2;
                start/=2;
            }
            else if(start==0){
                rem1=0;
            }
            System.out.println(rem1+" "+rem2);

            if((rem1^rem2)==1){
                result++;
            }

        }
        System.out.println(result);
    }
}
