import java.util.Scanner;

public class Calculator //CREATE CLASS
{
    public static void calculator() //CREATE METHOD CALCULATOR
    {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the value for A:-"); //TAKE THE VALUE FROM THE USER
        int a = data.nextInt();

        System.out.println("Enter the value for B:-");
        int b= data.nextInt();

        System.out.println("Enter the Operators:-"); //TAKE THE VALUE AS OPERATOR
        char ch=data.next().charAt(0);

        int cal;


        switch (ch) //CREATE SWITCH
        {
            case '*':                                 // CHECK THE CASE
                cal=a*b;
                System.out.println("Multiplication is:-"+cal);  //CALCULATE MULTIPLICATION
                break;
            case '+':
                cal=a+b;
                System.out.println("Addition is:-"+cal);
                break;
            case '/':
                cal=a/b;
                System.out.println("Division is:-"+cal);
                break;
            case '-':
                cal=a-b;
                System.out.println("Subtraction is:-"+cal);
                break;
            default:                                    //DEFAULT CASE WILL EXECUTE WHEN ALL THE CONDITION WILL BE FALSE
                System.out.println("Sorry invalid Enter");
        }


    }
    public static void main(String [] args)  // CREATE MAIN METHOD
    {
        System.out.println("----Calculator-----");
        calculator(); // CALL THE METHOD
    }
}
