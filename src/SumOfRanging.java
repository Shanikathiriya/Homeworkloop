import java.util.Scanner;

public class SumOfRanging//  CREATE CLASS
{

    public static void sumRange()// create the method which is find sum of given range
    {
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the First Value:-");// take the value from the user
        int a= data.nextInt();

        System.out.print("Enter the Second Value:-");
        int b= data.nextInt();
        int sum=0;

        for(int i=a;i<=b;i++)
        {
            sum=sum+i;

        }
        System.out.println("Sum Of Range From"+a+ "To" +b+ "is:=>"+sum);

    }
    public static void main(String [] args)// create the main method
    {
        sumRange();// call the method
    }
}
