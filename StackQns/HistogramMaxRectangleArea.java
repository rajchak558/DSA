package Stack;
/**Given a histogram represented by an array arr[],
 * where each element of the array denotes the height of the bars in
 * the histogram. All bars have the same width of 1 unit.

 Find the largest rectangular area possible in the given histogram,
 where the rectangle can be formed using a number of contiguous bars.

 Input: arr[] = [60, 20, 50, 40, 10, 50, 60] https://drive.google.com/file/d/1V3dPaf3tpNmGwA_PKlNJAsWSMhNMgdYX/view?usp=sharing
 Output: 100
 Explanation: We get the maximum by picking bars highlighted above
 in green (50, and 60). The area is computed = 50 * 2 = 100.

 */
public class HistogramMaxRectangleArea {
    public static void main(String args[]){
        int arr[]={3, 5, 1, 7, 5, 9};
        int maxArea=bruteforce(arr);
        System.out.println("Max area possible in histogram chart is "+maxArea);
    }
    public static int bruteforce(int[] arr){
        int maxarea=0; //(It is O(n^2) cmplexity
        int temp_area=0,common_length=0;
        for(int i=0;i<arr.length;i++){
            common_length=arr[i];
            for (int j=i+1;j< arr.length;j++){
                common_length=Math.min(common_length,arr[j]); // the common length across multiple bars in the chart start
                                                              // starting from arr[i]
                temp_area=common_length*(j-i+1);
                maxarea=Math.max(temp_area,maxarea);//Common length,breadth,temporary common area ,maxrea
                System.out.println(common_length+" "+(j-i+1)+" "+temp_area+" "+maxarea);
            }
            System.out.println("___________");
        }
        return maxarea;
    }
    // Solution with priority queue
}
