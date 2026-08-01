public class sortcolors {
    public static void main(String[] args) {
        int arr[]={2,0,1,0,2,2,1,1};
        int n = arr.length;
        int noz=0,noo=0, not=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                noz++;
            }
            else if(arr[i]==1){
                noo++;
            }
            else{
                not++;
            }  
            
        }
        for(int i=0;i<n;i++){
            if(i<noz){
                arr[i]=0;
            }
            else if(i<noz+noo){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
