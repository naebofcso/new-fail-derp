import java.util.Scanner;
public class TestFactorial //This is my first attempt to create a class on my own//
{
    public static void main(String[] args)
    {
        TestFactorial test = new TestFactorial();
        //While loop keeps the whole thing running so that its not a one time factorial//
        while(true)
        {
        System.out.println("Enter a number to find the factorial of");
        //Allows a headless input from user//
        Scanner input = new Scanner(System.in);
        //Converts the input into a string//
        String myString = input.nextLine();
        //Converts the string to an int//
        long i = Integer.parseInt(myString);
        //sets up boundaries so there are no errors//
        if(i<=1 && i>=-1)
        {
            System.out.println("The factorial of " + i + "is one");
            break;
        }
        else if(i<0)
        {
            System.out.println("Did you mean to input a negative [y/n]?");
            Scanner yesOrNo = new Scanner(System.in);
            String decision = yesOrNo.nextLine();
            if(decision.equals("n"))
            {
                continue;
            }
             else if(decision.equals("y"))
             {
                 test.InverseFactorial(i);
             }
             else
             {
                 System.out.println("Error, try another value");
                 continue;
             }
        }
        else if(i>0)
       {
        test.Factorial(i);
       }
     }
    }
    public int Factorial (long i)
    {
    
         long result = 1;
        for(long n = i; n>0; n--)
        {
            result = result*n;
        }
        System.out.println("The factorial of " + i + " is " + result);
        return result;
        }
    public int InverseFactorial (long i)
    {
        long result = 1;
        for(long n = i; n<0; n++)
        {
            result = result*n;
        }
        System.out.println("The factorial of " + i + " is " + result);
        return result;
    }
    }