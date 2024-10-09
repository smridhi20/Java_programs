import java.util.*;

public class employee {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random n=new Random();
    total(n);

}
    public static void total(Random n){
        int earnings=0;
        for(int i=0;i<30;i++){
            int at=n.nextInt(2-0+1)+0;   //(max-min+1)-min
            if(at==0){
               earnings+=0;
            }
            else if(at==1){
                earnings+=500;
            }
            else if(at==2){
                earnings+=1000;
            }
         }
        System.out.println(earnings+" "); 
    }

}
