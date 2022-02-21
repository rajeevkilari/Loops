import java.util.Scanner;
public class RangePalindrome{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i=1;
        while(i<=n){
            int num=i;
            int rev=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            rev=rem+(10*rev);
            num=num/10;
        }
        num=i;
        if(rev==num){
            System.out.println(i);
        }
         i=i+1;   
        }
    }
}