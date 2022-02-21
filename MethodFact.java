import java.util.Scanner;
public class MethodFact{
    Scanner s = new Scanner(System.in);
        void factorial(){
        int n=s.nextInt();
        int answer=1;
        for(int i=1;i<=n;i++){
            answer=answer*i;
        }
        System.out.println(answer);
    }
   
    public static void main(String[] args){
            MethodFact f= new MethodFact();
            f.factorial();
        }
    }

    