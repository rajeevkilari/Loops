import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
       int i =2;
        while(i<=n){
            int div =2;
            int count =0;
            while(div<n){
                if(i%div==0){
                    break;
                }
                else{
                    div=div+1;
                    count=count+1;
                }
                 }
            if(count==(i-2)){
                System.out.println(i);
                 }
            i=i+1;
        }
       
        
        }
}