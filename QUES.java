import java.util.*;
public class QUES {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter the " + n +" elements");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if (arr[i]< 35){
                System.out.print(i+" ");
            }
        }
    }
    
}
