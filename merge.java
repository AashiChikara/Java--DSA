public class merge {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6,8};
        int n1=arr1.length;
        int n2= arr2.length;
        int m[]= new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                m[k]=arr1[i];
                i++;
                k++;
            }
            else {
                m[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(i==n1){
            while(j<n2){
                m[k]=arr2[j];
                j++;
                k++;
            }
        }
        else{
            while(i<n1){
                m[k]=arr1[i];
                i++;
                k++;
            }
        }
        for( int x=0;x<m.length;x++){
            System.out.print(m[x] +" ");
        }
    }
    
}
