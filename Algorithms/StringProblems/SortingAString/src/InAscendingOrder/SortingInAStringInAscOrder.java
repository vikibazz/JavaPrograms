/*

Input :

bdaefgzxjkmncopywtuhilqrsv

Output :

abcdefghijklmnopqrstuvwxyz

*/
public class SortingInAStringInAscOrder 
{

    public static void Sorting(String str) 
    {
        int MAX_CHAR = 26;
        
        int CharCount[] = new int [MAX_CHAR];

        for(int i = 0;i < str.length();i++)
        {
            CharCount[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < MAX_CHAR; i++) 
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