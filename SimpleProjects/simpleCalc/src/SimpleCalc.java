import java.util.Scanner;

public class SimpleCalc
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        while(true)
        {
            double a,b,res;

            System.out.println("Choose the operation that you want to perform 1,Add 2,Sub 3,Multiply 4,Divide 5,Exit");
            System.out.println("Enter your choice");
            int choice = s.nextInt();

            switch(choice)
            {

                case 1 :
                System.out.println("Enter the number 'a' ");
                a = s.nextDouble();

                System.out.println("Enter the number 'b' ");
                b = s.nextDouble();

                res = a + b;
                System.out.println(res);
                break;

                case 2:
                System.out.println("Enter the number 'a' ");
                a = s.nextDouble();

                System.out.println("Enter the number 'b' ");
                b = s.nextDouble();

                res = a - b;
                System.out.println(res);
                break;

                case 3:
                System.out.println("Enter the number 'a' ");
                a = s.nextDouble();

                System.out.println("Enter the number 'b' ");
                b = s.nextDouble();

                res = a * b;
                System.out.println(res);
                break;

                case 4:
                System.out.println("Enter the number 'a' ");
                a = s.nextDouble();

                System.out.println("Enter the number 'b' ");
                b = s.nextDouble();

                res = a / b;
                System.out.println(res);
                break;

                default :
                return;
            }
        }
    }
}