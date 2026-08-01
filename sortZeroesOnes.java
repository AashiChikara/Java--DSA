public class sortZeroesOnes {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,0,0,0,1,0};
        int n= arr.length;int noOfzero=0;
        for(int i=0;i<n;i++){
            if(arr[i]== 0){
                noOfzero++;
            }   
        }
        for( int i=0; i<n;i++){
            if(i<noOfzero){
                arr[i]=0;}
            else{
                arr[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print( arr[i]+" ");
        }
    }
} 