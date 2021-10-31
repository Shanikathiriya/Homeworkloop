import java.util.Scanner;

public class PrimeNumber// CREATE CLASS
{
    public void findPrime()// CREATE THE METHOD WHICH IS FIND PRIME NUMBER
    {
        System.out.println("---FIND PRIME NUMBER---");// TAKE THE VALUE FROM THE USER
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the value for N:-");
        int n= data.nextInt();
        boolean flag=false;

        for(int i=2;i<=n/2;i++)

        {
            if(n%i==0)
            {
                flag=true;
                break;
            }

        }
        if(!flag)
        {
            System.out.println(n+" is Prime");
        }
        else
        {
            System.out.println(n+" is not Prime");
        }


    }
    public static void main(String [] args)// CREATE THE MAIN METHOD
    {
        System.out.println("----FIND THE PRIME NUMBER----");
        PrimeNumber primeNumber=new PrimeNumber(); // CREATE THE OBJECT OF CLASS
        primeNumber.findPrime();//CALL THE METHOD BY USING OBJECT OF CLASS
    }
}
