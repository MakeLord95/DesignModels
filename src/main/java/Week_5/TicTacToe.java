package Week_5;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe extends Game {

    private char[][] board;
    private int moves;

    @Override
    void initializeGame() {
        board = new char[3][3];
        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }
        moves = 0;
        System.out.println("Tic-Tac-Toe Game Initialized!");
        printBoard();
    }

    @Override
    void makePlay(int player) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.printf("Player %d, enter your move (row and column eg. 0,2): ", player + 1);
            String[] coordinates = scanner.nextLine().split(",");

            row = Integer.parseInt(coordinates[0]);
            col = Integer.parseInt(coordinates[1]);

            if (isValidMove(row, col)) {
                board[row][col] = (player == 0) ? 'X' : 'O';
                moves++;
                printBoard();
                break;
            } else {
                System.out.println("Invalid move! Please try again.");
            }
        } while (true);
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private void printBoard() {
        System.out.println("    0   1   2 ");
        System.out.println("   +---+---+---");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "  | ");

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n   +---+---+---");
        }
    }

    @Override
    boolean endOfGame() {
        return moves == 9 || checkWinner('X') || checkWinner('O');
    }

    @Override
    void printWinner() {
        if (checkWinner('X')) {
            System.out.println("Player 1 (X) wins!");
        } else if (checkWinner('O')) {
            System.out.println("Player 2 (O) wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    private boolean checkWinner(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (checkRowOrColumn(i, symbol) || checkDiagonal(symbol)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkRowOrColumn(int index, char symbol) {
        return (board[index][0] == symbol && board[index][1] == symbol && board[index][2] == symbol) ||
                (board[0][index] == symbol && board[1][index] == symbol && board[2][index] == symbol);
    }

    private boolean checkDiagonal(char symbol) {
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }
}
