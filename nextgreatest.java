public class nextgreatest {
    public static void main(String[] args) {
        int arr[]={12,8,41,37,2,49,16,28,21,5};
        int n = arr.length;
        int ans[]=new int[n];
        // for(int i=0;i<n;i++){
        //     int mx= Integer.MIN_VALUE;
        //     for(int j=i+1;j<n;j++){
        //         mx= Math.max(mx,arr[j]);
        //     }
        //     ans[i]=mx;
        // }
        // ans[n-1]= -1;
        // for(int i=0;i<n;i++){
        //     System.out.print(ans[i]+" ");
        // }
        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge= Math.max(nge,arr[i]);
            
        }
        ans[n-1]=-1;

        for(int i=0;i<n;i++){
             System.out.print(ans[i]+" ");
         }
    }
    
}

