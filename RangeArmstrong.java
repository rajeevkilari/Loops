import java.util.Scanner;
public class RangeArmstrong{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i=1;
        while(i<=n){
            int num=i;
            int digit=0;
            while(num>0){
                num=num/10;
                digit=digit+1;
            }
            num=i;
            int rem=0;
            int sum=0;
            while(num>0){
               rem=num%10;
               sum=sum+(int)(Math.pow(rem,digit));
               num=num/10;
            }
            num=i;
            if(sum==num){
                System.out.println(i);
            }
            i=i+1;
        }
    }
}
