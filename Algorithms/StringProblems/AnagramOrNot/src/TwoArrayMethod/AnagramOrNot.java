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

// Two array method

import java.util.Arrays;

public class AnagramOrNot
{

    public static boolean areAnagram(char[] s1,char[] s2) 
    {
        int NO_OF_CHARS = 256;

        int m = s1.length;
        int n = s2.length;

        if(m != n)
        {
            return false;
        }

        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1,0);
        
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2,0);

        for(int i = 0; i < s1.length && i < s2.length;i++)
        {
            count1[s1[i]]++;
            count2[s2[i]]++;
        }

        for(int i = 0;i < NO_OF_CHARS;i++)
        {
            if (count1[i] != count2[i]) 
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) 
    {
        char [] s1 = "god".toCharArray();
        char [] s2 = "dog".toCharArray();
        
        boolean check = areAnagram(s1,s2);

        if (check) 
        {
            System.out.println("Strings are anagram");    
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
}














