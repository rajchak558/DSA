package binarysearchp_rograms;

public class nth_root_ofnumber {
    public static void main(String args[]){
        int n=4,m=1296;
        nth_root(n,m);
    }
    static void nth_root(int n,int m){
        int left=0,right= m /n;int flag=0;
        while(left<right-1){
            int mid= (left+right)/2;
            int pow=1;

                System.out.println(mid+" "+left+" "+right);

            for(int i=1;i<=n;i++){
                pow*=mid;
                System.out.println(pow);
                if(pow==m){
                    System.out.println(n+" th root of "+m+" is "+mid);
                    flag=1;
                    left=right;
                    break;
                }
                else if(pow > m){
                    System.out.println(pow);
                    break;
                }

            }
            if(pow<m){
                left=mid;
            }
            if(pow>m){
                right=mid;
            }


        }
        if (flag==0){
            System.out.println(n+" th root of "+m+" is -1");
        }
    }
}
