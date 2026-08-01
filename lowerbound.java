import java.util.*;
public class lowerbound{
    public static int LB(int arr[], int x){
        int l=0, h=arr.length-1;
        int n=arr.length;
        int lb=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=x){
                lb=Math.min(lb,mid);
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return lb;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int ans=LB(arr,x);
        System.out.println(ans);
    }
}