import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int fact=n;
        for(int i=n-1;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}