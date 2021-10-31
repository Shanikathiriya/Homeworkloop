import java.util.Scanner;

public class FactorialNumber //CREATE THE CLASS
{
    public static void findFact(int n) // CREATE THE METHOD WHICH IS FIND FACTORIAL NUMBER
    {
        int fact=1;
        for(int i=1;i<=n;++i)
        {
            fact=fact*i;

        }
        System.out.println("Factorial of "+n+"is:=>"+fact); //PRINT FACTORIAL NUMBER

    }
    public static void main(String [] args)//CREATE MAIN METHOD
    {

        Scanner data=new Scanner(System.in); //TAKE THE VALUE FROM THE USER
        System.out.println("Enter the value for N:-");
        int n= data.nextInt();
        findFact(n);  // CALL THE METHOD N PASS THE ARGUMENT



    }
}
