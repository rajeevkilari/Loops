import java.util.Scanner;
public class MethodSum{
    public int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a =s.nextInt();
    MethodSum nat = new MethodSum();
    int answer=nat.sum(a);
    System.out.println(answer);
}
}