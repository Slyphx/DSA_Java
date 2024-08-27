import java.util.Scanner;
public class palindromeNumberusingString {
    public static boolean checker(long x){
        String str = Long.toString(x);
        StringBuilder str2 = new StringBuilder(str)
        ;
        String rev = str2.reverse().toString();
        return str.equals(rev);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long x= s.nextInt();
        
        boolean result= checker(x);
        System.out.println(result);
    }
}
