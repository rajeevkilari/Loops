public class Pattern7{
    public static void main(String[] args){
        char ch='A';
        int n= (int)ch;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(ch + " ");
                n=n+1;
            ch=(char)n;
            }
            System.out.println();
        }
         }
}