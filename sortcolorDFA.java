public class sortcolorDFA {
    public static void swap(int arr[], int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,1,2,1,0,0,1,0,2};
        int n = arr.length;
        int m=0, h=n-1,l=0;
        while(m<=h){
           if(arr[m]==0){
                swap(arr, m,l);
                l++; m++;    
            }
            else if(arr[m]==1){
                m++;
            }
            else{
               swap(arr, m, h);
                h--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
