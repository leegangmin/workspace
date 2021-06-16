package may31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicTacToeGame_Refactoring {

    public static void main(String[] args) {

        final int n = 3;
        final int range = 3;
        final int pickedSize = 2;

        char board[][] = new char[n][n];
        List<Integer> picked = new ArrayList<Integer>();
        List<TwoDimensions> randomInput = new ArrayList<TwoDimensions>();

        // 1. init (random input)
        createInput(picked, pickedSize, range, randomInput);
        Collections.shuffle(randomInput);

        // 2. input data (board)
        char mark = 'O';

        for (TwoDimensions in : randomInput)
        {
            board[in.x][in.y] = mark;
            if (isDecideWinner(board, in.x, in.y, mark)) 
            {
                print(board);
                System.out.println("Winner is : " + mark);
                return;
            }
            if (mark == 'O') mark = 'X';
            else mark = 'O';
        }

        // 3. Draw
        print(board);
        System.out.println("draw");
    }

    public static void print(char board[][]) {

        int boardSize = board.length;

        for (int i = 0 ; i < boardSize; i++) {
            for (int j = 0 ; j < boardSize; j++)
                System.out.print(board[i][j] + "\t");
            System.out.println();
        }
    }

    public static boolean isDecideWinner(char board[][], int x, int y, char mark) {

        int boardSize = board.length;

        // width
        for (int i = 0 ; i < boardSize; i++) 
        {
            if (board[x][i] != mark) 
                break;
            else if (i == boardSize -1)
                return true;
        }

        // height
        for (int i = 0 ; i < boardSize; i++) 
        {
            if (board[i][y] != mark) 
                break;
            else if (i == boardSize -1)
                return true;
        }

        // diagonal
        if ( x == y || Math.abs(x-y) == boardSize) 
        {
            for (int i = 0 ; i < boardSize ; i++)
            {
                if (board[i][i] != mark)
                    break;
                else if ( i == boardSize -1)
                    return true;
            }

            for (int i = 0 ; i < boardSize ; i++)
            {
                if (board[i][boardSize-1] != mark)
                    break;
                else if ( i == boardSize - 1)
                    return true;
            }
        }


        return false; 
    }

    public static void createInput(List<Integer> picked, int pickedSize, int range, List<TwoDimensions> storage)
    {
        if(picked.size() == pickedSize)
        {
            TwoDimensions dimensions = new TwoDimensions();
            dimensions.x = picked.get(0); dimensions.y = picked.get(1);
            storage.add(dimensions);
            return ;
        }

        for(int next = 0 ; next < range ; next++)
        {
            picked.add(next);
            createInput(picked, pickedSize, range, storage);
            picked.remove(picked.size() -1);
        }
    }
}

class TwoDimensions
{
    int x; int y;
}
