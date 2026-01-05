import java.util.*;
public class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=n;
        int s=0;
        while(n>0){
            int d=n%10;
            s=s*10+d;
            n=n/10;
        }
        System.out.println((s == rev)?"palindrome":"not palindrome");
    }
}
