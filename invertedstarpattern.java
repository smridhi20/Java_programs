import java.util.Scanner;

public class invertedstarpattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
