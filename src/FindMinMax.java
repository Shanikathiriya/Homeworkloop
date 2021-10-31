import java.util.Scanner;

public class FindMinMax // CREATE THE CLASS
{

    public static void min(int num1,int num2,int num3) // CREATE THE MIN METHOD FOR FINDING MINIMUM VALUE
    {
        if(num1<=num2 && num1<= num3) // CHECK THE CONDITION FOR MINIMUM
        {
            System.out.println(num1+"Is Minimum Number");
        }
        else if(num2<=num1 && num2<=num3)
        {
            System.out.println(num2+"Is Minimum Number");
        }
        else
        {
            System.out.println(num3+"IS Minimum Number");
        }
    }
    public static void max(int num1,int num2,int num3) // CREATE THE MAX METHOD FOR FINDING MAXIMUM VALUE
    {
        if(num1>=num2 && num1>=num3) //CHECK THE CONDITION FOR MAXIMUM
        {
            System.out.println(num1+"Is Maximum Number");

        }
        else if(num2>=num1 && num2>=num3)
        {
            System.out.println(num2+"Is Maximum Number");
        }
        else
        {
            System.out.println(num3+"Is Maximum Number");

        }

    }
    public static void main(String [] args)  // CREATE THE MAIN METHOD
    {
        System.out.println("---FIND MIN OR MAX NUMBER---");  // TAKE THE VALUE FROM THE USER USING SCANNER CLASS
        Scanner data= new Scanner(System.in);
        System.out.println("Enter First Number:-");
        int num1= data.nextInt();

        System.out.println("Enter Second Number:-");
        int num2= data.nextInt();

        System.out.println("Enter Third Number:-");
        int num3= data.nextInt();

        max(num1,num2,num3);// CALL THE MAX METHOD AND PASS THE THREE INT  ARGUMENT
        min(num1,num2,num3);// CALL THE MIN METHOD AND PASS THE THREE INT ARGUMENT


    }
}
