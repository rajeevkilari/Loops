import java.util.Scanner;
public class Fibanocci{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        System.out.println(i);
        int j=1;
        System.out.println(j);
        int sum=0;
        int count=2;
        while(count<n){
            sum=i+j;
            count=count+1;
            System.out.println(sum);
            i=j;
            j=sum;
        }
        
    }
}