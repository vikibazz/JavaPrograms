
import java.util.ArrayList;

class Booking
{
    int customerID;
    char PickupPoint;
    char dropPoint;
    int pickupTime;
    int dropTime;
    int totalEarnings;
    int taxiNo;
    ArrayList<Taxi>t;

    Booking(int id,char pick,char drop,int pickTime)
    {
        customerID  = id;
        PickupPoint = pick;
        dropPoint   = drop;
        pickupTime  = pickTime;
    }

    public void departTime()
    {
        this.dropTime = pickupTime + Math.abs(PickupPoint - dropPoint);
    }

    public void totalEarnings()
    {
        int dist = 15 * Math.abs(PickupPoint - dropPoint);
        this.totalEarnings = 100 + ((dist - 5) * 10);
    }

    public int isAvailable(ArrayList<Taxi>t)
    {
        int min = 6;
        int temp = -1;
        int i;

        for(i = 0;i < 4;i++)
        {
            if(Math.abs(PickupPoint - t.get(i).initialPoint) <= min && t.get(i).departureTime <= pickupTime)
            {
                if(temp == -1 || Math.abs(PickupPoint - t.get(i).initialPoint) < min)
                {
                    temp = i;
                }

                if(Math.abs(PickupPoint - t.get(i).initialPoint) == min && t.get(i).earnings != 0)
                {
                    if(t.get(temp).earnings > t.get(i).earnings)
                    {
                        temp = i;
                    }
                }
                    min = Math.abs(PickupPoint - t.get(i).initialPoint);
            }
        }

        if(min != 6)
            {
                t.get(temp).departureTime(pickupTime,PickupPoint,dropPoint);
                t.get(temp).initialPoint = dropPoint;
                taxiNo = temp;
                return temp;
            }
            
        return -1;
    }
}