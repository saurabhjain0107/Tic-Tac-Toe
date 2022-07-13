package com.bridgelabz;
import java.util.Scanner;
public class TicTocToe {

    static char board[] = new char[10];
    static Scanner sc = new Scanner(System.in);
    static char computerChoice;
    static char playerChoice;

    static int position;
    static char Symbol;
    static char choice;

    static void createBoard(char[] board) {
        for (int i = 1; i < board.length; i++) {
            board[i] = '_';
        }
    }

    static void showBoard(char[] board) {
        for (int i = 1; i < board.length; i++) {
            System.out.print(board[i]);
            System.out.print(" ");
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }

    static char playerChoice() {
        System.out.println("Choose a Symbol(x,o)");
        Symbol = sc.next().charAt(0);
        return Symbol;
    }

    static char computerChoice() {
        if (Symbol == 'x') {
            return 'o';
        } else {
            return 'x';
        }
    }

    static void updateBoard(char board[], int player, int position) {
        if (player == 1) {
            Symbol = playerChoice();
        } else {
            Symbol = computerChoice();
        }
        switch (position) {
            case 1:
                board[1] = Symbol;
                break;
            case 2:
                board[2] = Symbol;
                break;
            case 3:
                board[3] = Symbol;
                break;
            case 4:
                board[4] = Symbol;
                break;
            case 5:
                board[5] = Symbol;
                break;
            case 6:
                board[6] = Symbol;
                break;
            case 7:
                board[7] = Symbol;
                break;
            case 8:
                board[8] = Symbol;
                break;
            case 9:
                board[9] = Symbol;
                break;
            default:
                break;
        }
    }

    static void playerMove(char[] board) {
        System.out.println("Please make a move in between 1 to 9");
        position = sc.nextInt();

        updateBoard(board, 1, position);
        System.out.println("Player moved to position " + position);
    }

    static void computerMove(char[] board) {
        position = (int) ((Math.random() * 10) % 9) + 1;
        updateBoard(board, 2, position);
        System.out.println("Computer moved to position " + position);
    }


    public static void main(String[] args) {
        do {
            createBoard(board);

            playerChoice = playerChoice();
            computerChoice = computerChoice();

            showBoard(board);
            playerMove(board);
            showBoard(board);
            computerMove(board);
            showBoard(board);
            System.out.println("Do you want to Continue(y/n)");
            choice=sc.next().charAt(0);
        }while(choice == 'y');
    }
}
