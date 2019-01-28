import java.util.*;

class NQueens
{
    //number of queens
    private static int number;
    //chessboard

    //function to check if the cell is attacked or not
    static boolean isAttack(int count1,int count2,int board[][])
    {
        int variable1,variable2;
        //checking if there is a queen in row or column
        for(variable1=0;variable1<number;variable1++)
        {
            if((board[count1][variable1] == 1) || (board[variable1][count2] == 1))
                return true;
        }
        //checking for diagonals
        for(variable1=0;variable1<number;variable1++)
        {
            for(variable2=0;variable2<number;variable2++)
            {
                if(((variable1+variable2) == (count1+count2)) || ((variable1-variable2) == (count1-count2)))
                {
                    if(board[variable1][variable2] == 1)
                        return true;
                }
            }
        }
        return false;
    }

     static boolean nQueen(int n, int board[][])
    {
        int count1,count2;
        //if n is 0, solution found
        if(n==0)
            return true;
        for(count1=0;count1<number;count1++)
        {
            for(count2=0;count2<number;count2++)
            {
                //checking if we can place a queen here or not
                //queen will not be placed if the place is being attacked
                //or already occupied
                if((!isAttack(count1,count2,board)) && (board[count1][count2]!=1))
                {
                    board[count1][count2] = 1;
                    //recursion
                    //whether we can put the next queen with this arrangement or not
                    if(nQueen(n-1, board)==true)
                    {
                        return true;
                    }
                    board[count1][count2] = 0;
                }
            }
        }
        return false;
    }
}