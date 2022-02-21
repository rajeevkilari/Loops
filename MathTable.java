import java.util.Scanner;
public class MathTable{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        for(int i=1;i<=15;i++){
            System.out.println(n + "x" +  i + "="+ n*i);
        }
    }
}
