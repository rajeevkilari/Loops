import java.util.Scanner;
public class Fact{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int i=1;
        int fact=1;
        while(i<=n){
            fact=fact*i;
            i=i+1;
        }
        System.out.println(fact);
    }
}