import java.util.Scanner;

public class MultiplicationTable// CREATE CLASS
{
    public static void table()// CREATE A METHOD FOR FIND TABLE
    {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the value for N:-");//TAKE THE VALUE FROM USER
        int n = data.nextInt();

        for(int i=1;i<=12;i++)
        {
            System.out.println(n +" * "+i+" = "+n*i);
        }
    }
    public static void main(String [] args)// CREATE MAIN METHOD
    {
        System.out.println("-----CREATE MULTIPLICATION TABLE-----");
        table();// CALL THE METHOD
    }
}
