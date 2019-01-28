import java.util.*;

public class NQueens
{
    //number of queens
    private static int number;
    //chessboard
    private static int[][] board = new int[100][100];

    //function to check if the cell is attacked or not
    private static boolean isAttack(int count1,int count2)
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

    private static boolean nQueen(int n)
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
                if((!isAttack(count1,count2)) && (board[count1][count2]!=1))
                {
                    board[count1][count2] = 1;
                    //recursion
                    //whether we can put the next queen with this arrangement or not
                    if(nQueen(n-1)==true)
                    {
                        return true;
                    }
                    board[count1][count2] = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //taking the value of N
        System.out.println("Enter the value of N for NxN chessboard");
        number = s.nextInt();

        int first,second;
        //calling the function
        nQueen(number);
        //printing the matrix
        for(first=0;first<number;first++)
        {
            for(second=0;second<number;second++)
                System.out.print(board[first][second]+"\t");
            System.out.print("\n");
        }
        
    }
}