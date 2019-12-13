/*

Input1 :

String1 dog
String2 god

Output2 :
It is an anagram

Input2:

String1 meat
String2 eat

Output2 :

Not an anagram

*/


import java.util.Arrays;

public class AnagramOrNot
{
    public static boolean areAnagram(char [] s1,char []s2) 
    {
        int NO_OF_CHARS = 256;

        int m = s1.length;
        int n = s2.length;
        
        if(m != n)
        {
            return false;
        }

        int count [] = new int[NO_OF_CHARS];
        Arrays.fill(count,0);
        
        for (int i = 0; i < s1.length && i < s2.length; i++) 
        {
            count[s1[i]]++;
            count[s2[i]]--;    
        }

        for (int i = 0; i < NO_OF_CHARS; i++) 
        {
            if (count[i] != 0) 
            {
                return false;    
            }   
        }

        return true;
    }
    public static void main(String[] args) 
    {
        char [] s1 = "triangle".toCharArray();
        char [] s2 = "integral".toCharArray();
        
        boolean check = areAnagram(s1,s2);

        if (check) 
        {
            System.out.println("The given strings are an anagram");    
        }
        else
        {
            System.out.println("not an anagram");
        }
    }
}















