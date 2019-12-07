/*

Input :

hakuna matata solutions

Output :

aahknu  aaamtt  ilnoosstu

*/
public class ArrangingTheArrayOfStrings 
{

    public static void Sorting(String str[]) 
    {
        int MAX_CHAR = 26;
        
        for (int k = 0; k < str.length; k++) 
        {
            int CharCount[] = new int [MAX_CHAR];

            for(int i = 0;i < str[k].length();i++)
            {
                CharCount[str[k].charAt(i) - 'a']++;
            }

            for (int i = 0; i < MAX_CHAR; i++) 
            {
                for (int j = 0; j < CharCount[i]; j++) 
                {
                    System.out.print((char)('a' + i));    
                }   
            }

            System.out.print("\t");
        }
    }
    public static void main(String[] args) 
    {
        String str[] = {"hakuna","matata","solutions"};
        
        Sorting(str);
    }    
}