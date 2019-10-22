

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();
        Taxi t3 = new Taxi();
        Taxi t4 = new Taxi();

        Scanner s = new Scanner(System.in);

       // int n = 4;
        int i = 0;
        int j = 0;

        ArrayList<Taxi>t = new ArrayList<Taxi>();

        t.add(t1);
        t.add(t2);
        t.add(t3);
        t.add(t4);
        
        ArrayList<Booking>b = new ArrayList<Booking>(10);

        while(true)
        {
            System.out.println("\n\nEnter your choice: ");
            
            System.out.println("1,Booking 2,Taxi Details 3,Exit");
            int choice = s.nextInt();

            if(choice < 1 ||choice > 3)
            {
                System.out.println("Invalid Input");
            }

            if(choice == 1)
            {
                System.out.println("Customer ID : ");
                int id = s.nextInt();

                System.out.println("Pickup point : ");
                s.nextLine();
                char pickUp = s.nextLine().charAt(0);

                System.out.println("Drop point");
                char drop = s.nextLine().charAt(0);

                System.out.println("Pickup time");
                int pickTime = s.nextInt();

                b.add(i, new Booking(id,pickUp,drop,pickTime));
                int a;
                
                a = b.get(i).isAvailable(t);

                System.out.println("Output :"+(i+1));

                if(a != -1)
                {
                    System.out.println("Taxi "+(a+1)+" is allotted");
                    t.get(a).earnings(b.get(i).PickupPoint,b.get(i).dropPoint);
                    b.get(i).departTime();
                    b.get(i).totalEarnings();
                }
                else
                {
                    System.out.println("Booking Rejected");
                }
                    i++;
            }
            else if(choice == 2)
            {
                System.out.println("Taxi no:\t Total Earnings:");
                System.out.println("Booking ID \t Customer ID \t From \t To \t PickupTime \t DropTime \t Amount");

                System.out.println("Output:");
                for(int k = 0;k < 4;k++)
                {
                    if(t.get(k).earnings != 0)
                    {
                        System.out.println("Taxi no: "+(k+1)+"\t Total Earnings: "+"Rs."+t.get(k).earnings);

                        for(int a = 0; a < i;a++)
                        {
                            if(b.get(a).taxiNo == k)
                            {
                                System.out.println((++j)+"\t"+(b.get(a).customerID)+"\t"+(b.get(a).pickupTime)+"\t"+(b.get(a).dropTime)+"\t"+(b.get(a).totalEarnings));
                            }
                        }
                    }
                }
            }
            else if(choice == 3)
            {
                return;
            }
        }
    }
}