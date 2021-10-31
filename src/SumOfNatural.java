import java.util.Scanner;

public class SumOfNatural //CREATE THE CLASS
{

    public static void sum(int n) // CREATE THE METHOD
    {
        int sum=0;
        for(int i=1;i<=n;i++)

        {
            sum+=i;  //sum=sum+i;

        }
        System.out.println("SUM OF NATURAL NUMBER IS:-"+sum);


    }
    public static void main(String [] args) //CREATE MAIN METHOD
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the value for N:-"); //TAKE THE VALUE FROM USER
        int n= data.nextInt();
        sum(n);//CALL THE METHOD AND PASS THE ARGUMENT

    }
}
