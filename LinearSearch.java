import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        boolean flag= false;
        for (int i =0; i<n; i++){
            if(arr[i]== x){
                flag = true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }

    }
    
}
