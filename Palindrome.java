import java.util.Scanner;
public class Paliondrome{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int num=n;
        int rev=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            rev=rem+(10*rev);
            num=num/10;
        }
        num=n;
        if(rev==num){
            System.out.println("is palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}