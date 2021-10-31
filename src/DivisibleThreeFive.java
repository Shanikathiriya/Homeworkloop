public class DivisibleThreeFive // CREATE CLASS
{
    public void div() //CREATE THE DIVISION METHOD
    {
        System.out.println("Divisible by 3         Divisible by 5");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0)  // CHECK THE CONDITION FOR DIVISIBLE FOR 3
            {
                System.out.print("\t\n"+i);  //PRINT THE DIVISIBLE OF 3
            }
            else if(i%5==0)  // CHECK THE CONDITION FOR DIVISIBLE FOR FIVE
            {
                System.out.print("                           "+i);  // PRINT THE DIVISIBLE OF 5
            }
        }

    }
    public static void main(String [] args) // CREATE THE MAIN METHOD
    {
        DivisibleThreeFive divisibleThreeFive=new DivisibleThreeFive(); // CREATE THE OBJECT OF CLASS
        divisibleThreeFive.div();   // CALL THE METHOD USING OBJECT OF CLASS
    }
}
