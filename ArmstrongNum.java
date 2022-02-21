import java.util.Scanner;
public class ArmstrongNum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int num=n;
        int rem=0;
        int res=0;
        int count=0;
        while(num>0){
           // rem=num%10;
            num=num/10;
            count=count+1;
        }
        num=n;
        while(num>0){
            rem=num%10;
            int i = (int)(Math.pow(rem,count));
            res=res+i;
            num=num/10;
        }
        num=n;
        if(res==num){
           System.out.println("is armstrong"); 
        }else{
            System.out.println("not an armstrong");
        }
    }
}
       