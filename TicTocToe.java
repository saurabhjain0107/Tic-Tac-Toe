package com.bridgelabz;

public class TicTocToe {

    static char board[]=new char[10];

    static void createBoard(char[]board){
        for(int i=1;i<board.length;i++){
            board[i]= '_';
        }
    }
    static void showBoard(char[]board){
        for(int i=1;i<board.length;i++){
            System.out.print(board[i]);
            if(i%3==0){
                System.out.println();
            }
        }
    }




    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game !");
        createBoard(board);
        showBoard(board);
    }
}
