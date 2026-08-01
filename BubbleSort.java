import java.util.*;
public class BubbleSort{
    public static void BS(int [] arr){
        int n= arr.length;
        for(int x=0;x<n-1;x++){
            for(int i=0;i<n-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }    
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        BS(num);
    }
}