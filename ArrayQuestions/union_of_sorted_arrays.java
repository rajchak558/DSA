package ArrayQuestions;

import java.util.HashSet;

public class union_of_sorted_arrays {
    public static void main(String args[]){
        int arr1[]={1,3,6,7,8,9};
        int arr2[]={5,12,16};
        //using_set(arr1,arr2);
        two_pointer(arr1,arr2);

    }
    public static void using_set(int []arr1,int []arr2){
        HashSet<Integer> set=new HashSet<>();
        int res[]=new int[arr1.length+ arr2.length-1];
        for (int i=0;i<(arr1.length+arr2.length-1);i++){
            if(i< arr1.length){
                set.add(arr1[i]);
            }
            else {
                set.add(arr2[i-arr1.length]);
            }
        }
        int i=0;
        for (int n:set){
            System.out.print(n+" ");
            res[i]=n;
            i++;
        }
    }
    public static  void two_pointer(int arr1[],int[] arr2){
        int p1=0,p2=0;
        int res[]=new int[arr1.length+arr2.length];
        for(int i=0;i<(arr1.length+arr2.length);i++){
            if(arr1[p1]<arr2[p2]){
                res[i]=arr1[p1];
                if (p1<arr1.length-1)
                    p1++;
            }
            else if (arr1[p1]>arr2[p2]) {
                res[i]=arr2[p2];
                if (p2<arr2.length-1)
                    p2++;
            }
            else if(p1==arr1.length-1){
                p2++;
                res[i]=arr2[p2];

            }
            else if(p2==arr2.length-1){
                res[i]=arr1[p1];
                p1++;
            }
            else if (arr1[p1]==arr2[p2]){
                res[i]=arr1[p1];
                p1++;
                p2++;
            }
        }
        for (int n:res){
            System.out.print(n+" ");
        }
    }
}
