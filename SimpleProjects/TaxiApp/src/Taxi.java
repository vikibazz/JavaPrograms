
class Taxi
{
    char initialPoint;
    int departureTime;
    int earnings;

    Taxi()
    {
        initialPoint = 'A';
    }

    public void departureTime(int pickTime,char Pick,char Drop)
    {
        this.departureTime = pickTime + Math.abs(Pick - Drop);
    }

    public void earnings(char Pick,char Drop)
    {
        int dist = 15 * Math.abs(Pick - Drop);
        int amount = 100 + ((dist - 5) * 10);
        this.earnings = earnings + amount;
    }
}