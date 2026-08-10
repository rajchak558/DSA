package Bit_manipulation;
/*Problem Statement: Given an integer n, return true if it is a power of two.
Otherwise, return false. An integer n is a power of two if there exists an
integer x such that n == 2ˣ.*/
public class CheckPowerOfTwo {
    public static void main(String args[]){
        int n=552;
        System.out.println("The number is a power of 2:"+checkPower_2(n));
    }
    public static boolean checkPower_2(int num){
        int div=2,i=1;
        while (div < num ){
            if(num == div){
                return true;
            }
            i++;
            div=(int)(Math.pow(2,i));
            System.out.println(div);
        }
        return false;
        //return n > 0 && (n & (n - 1)) == 0;
        //Check if n is greater than 0 and has only one bit set
    }

}
