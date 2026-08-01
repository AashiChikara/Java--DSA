import java.util.*;
public class MinVal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int min= arr[0];
        int min1= Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min= arr[i];
            }
            min=Math.min(min,arr[i]);
        }
        System.out.println(min);

    }
}