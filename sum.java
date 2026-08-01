public class sum {
    public static void main(String[] args) {
        int arr[][]={{1,5,6},{2,3,4},{7,8,9}};
        int sum=0;
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of all elements is: "+sum);
        
    }
    
}
