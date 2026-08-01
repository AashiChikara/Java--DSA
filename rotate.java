import java.util.*;
public class rotate {
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k =k%n;

        int [] temp= new int[n];
        int x =0;
        for(int i=n-k;i<n;i++){
            temp[x]=arr[i];
            x++;
        }
        for(int i=0;i<n-k;i++){
            temp[x]=arr[i];
            x++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr,k);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");}

    }
    
}
