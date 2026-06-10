package ArrayQuestions;

public class reverse_a_array {
    public static void main(String args[]){
        int arr[]={1,6,7,9,4,3,26,11,19,15,24};
        int check_arr[]={3,4,9,1};
        int rev_array[]=solution(arr);
        for (int i:arr){
            System.out.print(" "+i);
        }
    }
    public static int[] solution(int arr[]) {
        for (int i=0;i< arr.length/2;i++){
            int last= arr.length-i-1;
            int temp;
            temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
        }
        return  arr;
    }
}
