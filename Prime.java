import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
       
        int div=2;
        int count=0;
        while(div<n){
            if(n%div==0){
                System.out.println("not prime");
                break;
            }else{
                div=div+1;
                count=count+1;
            }
        }
        if(count==n-2){
            System.out.println("is prime");
        }
        }
}