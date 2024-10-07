import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int st=0;
        int end=n-1;
        for(int i=0;i<n/2;i++){
            int temp=0;
            temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
