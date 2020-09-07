package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                result = monoHorizontal(board, i) || monoVertical(board, i);
                break;
            }
        }
        return result;
    }
    public static boolean monoHorizontal(int[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(int[][] board, int column) {
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 1) {
                return false;
            }
        }
        return true;
    }
}
