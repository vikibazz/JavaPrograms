public class StringExpand
{
    public static void main(String[] args) 
    {
        String s = "a10b5";
        char [] str = s.toCharArray();

        System.out.println("\nThe expansion of string "+s+" is: ");

        for(int i = 0;i < str.length;i++)
        {
            char a = str[i];
            int  b = str[++i] - 48;

            if(i + 1 >= str.length)
            {
                for (int j = 0; j < b; j++) 
                {
                    System.out.print(a);    
                }
                break;
            }

            if((int)(str[i + 1] - 48) > -1 && (int)(str[i + 1] -48) < 10)
            {
                b = b * 10 + (int)str[++i] - 48;
            }

            for (int j = 0; j < b; j++) 
            {
                System.out.print(a);   
            }
        }
        System.out.println();
    }
}