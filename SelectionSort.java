import java.util.*;
public class SelectionSort {
    public static void SS(int arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int min= Integer.MAX_VALUE;
            int mindx =-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[mindx];
            arr[mindx]= temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        SS(num);
    }
    
}
