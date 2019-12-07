/*

Input :

bdaefgzxjkmncopywtuhilqrsv

Output :

zyxwvutsrqponmlkjihgfedcba

*/
public class SortingAStringInDescendingOrder 
{

    public static void Sorting(String str) 
    {
        int MAX_CHAR = 26;
        
        int CharCount[] = new int [MAX_CHAR];

        for(int i = 0;i < str.length();i++)
        {
            CharCount[str.charAt(i) - 'a']++;
        }

        for (int i = MAX_CHAR - 1; i >= 0; i--) 
        {
            for (int j = 0; j < CharCount[i]; j++) 
            {
                System.out.print((char)('a' + i));    
            }   
        }
    }
    public static void main(String[] args) 
    {
        String str = "bdaefgzxjkmncopywtuhilqrsv";
        
        Sorting(str);
    }    
}