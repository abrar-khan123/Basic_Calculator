import java.util.Scanner;
public class Calculator 
{
   public static int ADD(int a,int b) 
	{
		return a+b;
    }
	public static int SUB(int a,int b) 
	{
        return a-b;
    }
	public static int MUL(int a,int b) 
	{
        return a*b;
    }
	public static int DIV(int a,int b) 
	{
        return (b!=0)?a/b:0; //Handling division by zero
    }
	public static int MOD(int a,int b) 
	{
        return (b!=0)?a%b:0; //Handling modulo by zero
    }
	public static void main(String[] args) 
	{
        Scanner scanner=new Scanner(System.in);
		System.out.println("Simple Calculator");
		while(true) 
		{
            System.out.println("\n1. ADD");
            System.out.println("2. SUB");
            System.out.println("3. MUL");
            System.out.println("4. DIV");
            System.out.println("5. MOD");
            System.out.println("6. EXIT");
            System.out.print("Enter your choice between [1 to 6]: ");
            int ch=scanner.nextInt();
            if(ch==6) 
			{
                System.out.println("Exiting calculator... bye!");
                break;
            }
            System.out.print("Enter two values: ");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            switch(ch) 
			{
                case 1:
                    System.out.println("Addition is: "+ADD(a,b));
                    break;
                case 2:
                    System.out.println("Subtraction is: "+SUB(a,b));
                    break;
                case 3:
                    System.out.println("Multiplication is: "+MUL(a,b));
                    break;
                case 4:
                    if(b!=0) 
                        System.out.println("Division is: "+DIV(a,b));
                    else 
                        System.out.println("Error: Division by zero is not allowed.");
                    break;
                case 5:
                    if(b!=0) 
                        System.out.println("Modulo is: "+MOD(a,b));
                    else 
                        System.out.println("Error: Modulo by zero is not allowed.");
                    break;
                default:
                    System.out.println("Invalid number! Please enter a choice between 1 to 6.");
            }
        }
        scanner.close();
    }
}