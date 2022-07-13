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

    static void createBoard(char[] board){
        for (int i=1;i<board.length;i++){
            board[i]='-';
        }
    }

    static void showBoard(char[] board){
        for(int i=1;i<board.length;i++){
            System.out.print(board[i]);
            System.out.print(' ');
            if(i%3==0){
                System.out.println();
            }
        }
    }
    static char playerChoice(){
        System.out.println("Enter the symbol you choose(x or o)");
        Symbol = sc.next().charAt(0);
        return Symbol;
    }
    static char computerChoice(){

        if (Symbol=='x'){
            return 'o';
        }
        else{
            return 'x';
        }

    }

    static void updateBoard(char[] board,int player,int position){
        if (player==1){
            Symbol = playerChoice;
        }
        else{
            Symbol = computerChoice;
        }
        switch (position) {
            case 1:
                board[1] = Symbol;
                showBoard(board);
                break;
            case 2:
                board[2] = Symbol;
                showBoard(board);
                break;
            case 3:
                board[3] = Symbol;
                showBoard(board);
                break;
            case 4:
                board[4] = Symbol;
                showBoard(board);
                break;
            case 5:
                board[5] = Symbol;
                showBoard(board);
                break;
            case 6:
                board[6] = Symbol;
                showBoard(board);
                break;
            case 7:
                board[7] = Symbol;
                showBoard(board);
                break;
            case 8:
                board[8] = Symbol;
                showBoard(board);
                break;
            case 9:
                board[9] = Symbol;
                showBoard(board);
                break;
            default:
                break;
        }

    }
    static boolean isValidMove(char[] board,int position){
        switch(position){
            case 1:
                if(board[1]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            case 2:
                if(board[2]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            case 3:
                if(board[3]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            case 4:
                if(board[4]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            case 5:
                if(board[5]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            case 6:
                if(board[6]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            case 7:
                if(board[7]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            case 8:
                if(board[8]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            case 9:
                if(board[9]=='-'){
                    return true;
                }
                else{
                    return false;
                }
            default:
                return false;
        }
    }
    static void playerMove(char[] board){
        System.out.println("Please make a move in between 1 to 9");
        position = sc.nextInt();
        boolean space = isValidMove(board,position);

        while(!space){
            System.out.println("Invalid move, Try again !!!");
            position = sc.nextInt();
            space = isValidMove(board,position);
        }

        updateBoard(board,1,position);
        System.out.println("Player moved to position "+ position);
    }
    static void computerMove(char[] board){
        position = (int)((Math.random()*10)%9)+1;
        boolean space = isValidMove(board,position);
        while(!space){
            System.out.println("Invalid move, Try again !!!");
            position = (int)((Math.random()*10)%9)+1;
            space = isValidMove(board,position);
        }
        updateBoard(board,2,position);
        System.out.println("Computer moved to position "+ position);
    }



    public static void main(String[] args) {
        do {
            createBoard(board);
            playerChoice = playerChoice();
            computerChoice = computerChoice();
            showBoard(board);
            playerMove(board);
            computerMove(board);
            playerMove(board);
            computerMove(board);
            playerMove(board);
            computerMove(board);

            System.out.println("Do you want to continue(y/n)");
            choice=sc.next().charAt(0);
        }while (choice == 'y');

    }
}
