import java.util.Scanner;

public class ReverseNumber //CREATE CLASS
{
    public static void findReverse(int n) //CREATE METHOD
    {
        int rev=0;

        for(;n!=0;n/=10)
        {
            int digit=n%10;
            rev = rev * 10+digit;
        }
        System.out.println("REVERSE NUMBER IS:-"+rev);

    }
    public static void main(String [] args) //CREATE MAIN METHOD
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the value for N:-"); //TAKE THE VALUE FROM USER
        int n= data.nextInt();
        findReverse(n); //CALL THE METHOD AND PASS THE VALUE

    }
}
