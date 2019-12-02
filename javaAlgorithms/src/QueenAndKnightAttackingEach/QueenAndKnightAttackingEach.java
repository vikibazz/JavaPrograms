/*
We are having Queen and Knight in a chess board.Check whether Queen and Knight attack each other or not 

Input: 
// here  the matrix represents 8x8 chess board
// '2' represents Queen pos
// '1' represents Knight pos
// Queen is a pos (2,4)
// Knight is a pos (3,6)

Input :
           Board [][] =  {{0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,2,0,0,0},
                          {0,0,0,0,0,0,1,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0}};

            QueenRow  = 2;
            QueenCol  = 4;
            KnightRow = 3;
            KnightCol = 6;

Output :
Knight attacks queen but queen doesnt attack Knight

*/
public class QueenAndKnightAttackingEach
{

    public static boolean CanQueenAttack(int QueenRow,int QueenCol,int KnightRow,int KnightCol)
    {
        if(QueenRow == KnightRow)
        {
            return true;
        }
        if(QueenCol == KnightCol)
        {
            return true;
        }
        if(Math.abs(QueenRow - KnightRow) == Math.abs(QueenCol - KnightCol)) 
        {
            return true;
        }

        return false;
    }

    public static boolean CanKnightAttack(int Board[][],int KnightRow,int KnightCol) 
    {
        int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; 
        int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        
        for(int i = 0;i < 8;i++)
        {
            int x = KnightRow + X[i];
            int y = KnightCol + Y[i];

            if(x >= 0 && y >= 0 && x < 8 && y < 8 && Board[x][y] == 2)
            {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) 
    {
        int Board [][] = {{0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,2,0,0,0},
                          {0,0,0,0,0,0,1,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0}};

        int QueenRow  = 2;
        int QueenCol  = 4;
        int KnightRow = 3;
        int KnightCol = 6;
        
        if((CanQueenAttack(QueenRow,QueenCol,KnightRow,KnightCol) == true) && (CanKnightAttack(Board, KnightRow, KnightCol)) == false)
        {
            System.out.println("Queen Attacks Knight but Knight doesnt attack queen");
        }

        else if((CanQueenAttack(QueenRow,QueenCol,KnightRow,KnightCol) == false) && (CanKnightAttack(Board, KnightRow, KnightCol)) == true)
        {
            System.out.println("Knight attacks queen but queen doesnt attack Knight");
        }

        else if((CanQueenAttack(QueenRow,QueenCol,KnightRow,KnightCol) == true) && (CanKnightAttack(Board, KnightRow, KnightCol)) == true)
        {
            System.out.println("Queen and Knight attacks each other");
        }

        else
        {
            System.out.println("They both dont attack each other");
        }
    }
}