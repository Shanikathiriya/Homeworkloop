import java.util.Scanner;

public class PrintNumber// CREATE CLASS
{

    public static void print() //CREATE A METHOD
    {
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the First Value:-");  // ENTER THE VALUE FROM USER
        int a= data.nextInt();

        System.out.print("Enter the Second Value:-");
        int b= data.nextInt();
        int count=0;

        if(a<b && b>=10)
        {

            for (int i = a; i <= b; i++) {
                System.out.println(i);
                count++;
                if (count == 10)
                    break;
            }
        }
        else
        {
            System.out.println("sorry invalid entry...");
        }


    }
    public static void main(String [] args) //CREATE  MAIN METHOD
    {
       print();//CALL THE METHOD

    }
}
