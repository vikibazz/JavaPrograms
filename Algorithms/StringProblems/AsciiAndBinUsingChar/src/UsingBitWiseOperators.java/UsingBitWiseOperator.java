/*
Input :

A

Output :

Ascii : 065
Binary : 01000001

*/

public class UsingBitWiseOperator
{
    public static void binaryValueIs(char c,int Ascii) 
    {
        int k = 0;
        System.out.println("The Binary value of "+c+" is :");
        for(int i = 31;i >= 0;i--)
        {
            k = Ascii >> i;

            if((k & 1) > 0)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
        }
    }
    public static void main(String[] args) 
    {
        char c = 'A';
        
        int Ascii = c;
        System.out.println("Ascii value of : "+c+" is : \n"+Ascii);

        binaryValueIs(c,Ascii);
    }
}