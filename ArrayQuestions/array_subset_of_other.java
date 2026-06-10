package ArrayQuestions;

import java.util.HashSet;

public class array_subset_of_other {
    public static void main(String args[]){
        int arr[]={1,6,7,9,4,3,26,11,19,15,24};
        int check_arr[]={3,4,9,1};
        solution(arr,check_arr);
    }
    public static void solution(int arr[],int sub_arr[]){
        HashSet <Integer> set= new HashSet<>();
        for (int i:arr){
            set.add(i);
        }
        int flag=0;
        for (int j:sub_arr){
            if (!set.contains(j)){
                flag++;
                System.out.println(flag);
            }
        }
        if (flag==0){
            System.out.println(" The given subarray is a subset of main array");
        }
        else if (flag>0){
            System.out.println(" The given subarray is not a subset of main array");
        }
    }
}
