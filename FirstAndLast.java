import java.util.*;
public class FirstAndLast {
    public static int[] FL(int arr[], int x){
        int n=arr.length;
        int l=0, h=n-1;
        int ans[]={-1,-1};
        int fp=-1;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==x){
                if(mid>0 && arr[mid]==arr[mid-1]){
                    h=mid-1;
                }
                else{
                    fp=mid;
                    break;
                }
            }
            else if(arr[mid]>x){
                h=mid-1;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            
        }
        int lp=-1;
        l=0;h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==x){
                if(mid+1<n && arr[mid]==arr[mid+1]){
                    l=mid+1;
                }
                else{
                    lp=mid;
                    break;
                }
            }
            else if(arr[mid]>x){
                h=mid-1;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            
        }
        ans[0]=fp;
        ans[1]=lp;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int ans[]=FL(arr,x);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
    

