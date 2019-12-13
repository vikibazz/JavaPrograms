/*

Input :

A

Output :

Ascii : 065
Binary : 01000001

*/
public class AsciiAndBinForGivenCharacter
{
    public static void convDecimalToBinary(int Ascii) 
    {
        StringBuilder Binary = new StringBuilder();

        while(Ascii != 0)
        {
            Binary.append(Ascii%2);
            Ascii = Ascii / 2;
        }
        
        Binary.reverse();

        System.out.println(Binary);
    }
    public static void main(String[] args) 
    {
        char c = 'z';

        int Ascii = c;

        System.out.println(Ascii);

        convDecimalToBinary(Ascii);
    }
}