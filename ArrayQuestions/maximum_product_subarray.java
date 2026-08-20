package arrayQuestions;

public class maximum_product_subarray {
    public static void main(String args[]){
        int arr[]={5,3,1,-2,0,-5,8,-3};
        int maximum_product_subarray = two_pointer(arr);
        System.out.println("The maximum product of the subarray is: "+maximum_product_subarray);
    }
    public static int brute_force_solution_me(int []arr){
            int max_result=0;
            for (int i=0;i<arr.length-1;i++){
                int temp=1;
                for (int j=i;j<arr.length-1;j++){
                    temp*=arr[j];
                    if(max_result<temp){
                        max_result=temp;
                        System.out.println(max_result);
                    }
                }
            }
            return max_result;
    }
    public static  int two_pointer(int arr[]){
        int min=arr[0],max=arr[0]; // the two pointers are min and max
        int ans=max;
        for(int i=1;i< arr.length;i++){
            int cur=arr[i];

            /** 5,3,1,-2,0,-5,8,-3
             max :15 min :3 ans :15
             max :15 min :1 ans :15
             max :-2 min :-2 ans :15
             max :0 min :0 ans :15
             max :0 min :-5 ans :15
             max :8 min :-40 ans :15
             max :120 min :-360 ans :120*/

            max=Math.max(cur,Math.max(max*cur,min*cur));
            min=Math.min(cur,Math.min(cur*min,cur*max));

            if(ans<max){
                ans=max;
            }
            System.out.println("max :"+max+" min :"+min+" ans :"+ans);
        }
        return ans;
    }
}
