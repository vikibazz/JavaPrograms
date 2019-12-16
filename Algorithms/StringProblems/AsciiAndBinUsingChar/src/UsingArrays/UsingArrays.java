
/*
Input :

A

Output :

Ascii : 065
Binary : 01000001

*/
public class UsingArrays
{

    public static void findingBinValue(int Ascii,char c) 
    {
        int BinaryVal[] = new int [32];
        
        int i = 0;

        while(Ascii > 0)
        {
            BinaryVal[i] = Ascii % 2;
            Ascii        = Ascii / 2;
            i++;
        }

        System.out.print("The Binary value of "+c+" is : ");
        for (int j = i - 1; j >= 0; j--) 
        {
            System.out.print(BinaryVal[j]);    
        }
    }
    public static void main(String[] args) 
    {
        char c = 'D';

        int Ascii = c;
        System.out.println("The Ascii value of "+c+" is : "+Ascii);

        findingBinValue(Ascii,c);
    }
}