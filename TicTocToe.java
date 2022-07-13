package com.bridgelabz;
import java.util.Scanner;
public class TicTocToe {

    static char board[]=new char[10];
    static Scanner sc = new Scanner(System.in);
    static char Symbol;
    static void createBoard(char[]board){
        for(int i=1;i<board.length;i++){
            board[i]= '_';
        }
    }
    static void showBoard(char[]board){
        for(int i=1;i<board.length;i++){
            System.out.print(board[i]);
            System.out.print(" ");
            if(i%3==0){
                System.out.println();
            }
        }
    }
    static char playerChoice(){
        System.out.println("Choose a Symbol(x,o)");
        Symbol=sc.next().charAt(0);
        return Symbol;
    }
    static char computerChoice(){
        if(Symbol == 'x'){
            return 'o';
        }else {
            return 'x';
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game !");
        createBoard(board);
        showBoard(board);
        System.out.println("Player Choice is "+playerChoice());
        System.out.println("Computer Choice is "+computerChoice());
    }
}
