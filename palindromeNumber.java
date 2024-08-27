import java.util.Scanner;
public class palindromeNumber {
    public static boolean palindromeChecker(int x){
        long reversed=0;
        int y=x;
        if(x<0){return false;}
        
        while(y>0){
            reversed=reversed*10+y%10;
            y/=10;
        }
        return x==reversed;
        
    }
    public static void main(String[] args) {
        int x;
        Scanner s= new Scanner(System.in);
        x=s.nextInt();
        s.close();
        System.out.println("the number entered is = "+x);
        boolean g=palindromeChecker(x);
        System.out.println(g);


    }
    
}
