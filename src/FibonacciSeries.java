import java.util.Scanner;

public class FibonacciSeries  // CREATE A CLASS
{
    public void findFibonacci() // CREATE A METHOD WHICH IS FIND FIBONACCI SERIES
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the value for N:-"); //TAKE THE INPUT FROM THE USER BY SCANNER CLASS
        int n= data.nextInt();

        int prev=0,next=1;

        for(int i=1;i<=n;i++)
        {
            System.out.println(prev+"");

            int ans=prev+next;            //CALCULATE FIBONACCI SERIES
            prev=next;
            next=ans;


        }
    }
    public static void main(String[] args)      //CREATE MAIN METHOD
    {
        System.out.println("----FIBONACCI SERIES-----");
        FibonacciSeries fibonacciSeries=new FibonacciSeries();  //CRETE OBJECT OF CLASS
        fibonacciSeries.findFibonacci();   //CALL THE METHOD USING CLASS OBJECT

    }

}
