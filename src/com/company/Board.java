package com.company;

public class Board {

    char playerSymbol = 'X';
    char computerSymbol = 'O';

    public char[][] board = new char[][]{
            {'1', '|', '2', '|', '3'},
            {'-', '-', '-', '-', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '-', '-', '-', '-'},
            {'7', '|', '8', '|', '9'}
    };

    public void printBoard(){
        for (int j = 0; j < 5; j++) {
            System.out.println(board[j]);
        }
    }

    public void playerMove(int m){
        if (m == 1 && board[0][0] == '1'){
            board[0][0] = playerSymbol;
        } else if (m == 2 && board[0][2] == '2'){
            board[0][2] = playerSymbol;
        } else if (m == 3 && board[0][4] == '3'){
            board[0][4] = playerSymbol;
        } else if (m == 4 && board[2][0] == '4'){
            board[2][0] = playerSymbol;
        } else if (m == 5 && board[2][2] == '5'){
            board[2][2] = playerSymbol;
        } else if (m == 6 && board[2][4] == '6'){
            board[2][4] = playerSymbol;
        } else if (m == 7 && board[4][0] == '7'){
            board[4][0] = playerSymbol;
        } else if (m == 8 && board[4][2] == '8'){
            board[4][2] = playerSymbol;
        } else if (m == 9 && board[4][4] == '9'){
            board[4][4] = playerSymbol;
        } else {
            System.out.println("Invalid input!");
        }
        computerMove();
        printBoard();

     }

     public void computerMove(){

         if(board[2][2] == '5'){
             board[2][2] = computerSymbol;
         } else if(board[0][0] == '1') {
             board[0][0] = computerSymbol;

         } else if(board[0][0] == computerSymbol && board[0][2] == computerSymbol && board[0][4] != computerSymbol && board[0][4] != playerSymbol){
             board[0][4] = computerSymbol;
         } else if(board[0][0] == computerSymbol && board[0][4] == computerSymbol && board[0][2] != computerSymbol && board[0][2] != playerSymbol){
             board[0][2] = computerSymbol;
         } else if(board[0][2] == computerSymbol && board[0][4] == computerSymbol && board[0][0] != computerSymbol && board[0][0] != playerSymbol){
             board[0][0] = computerSymbol;
             //row 1 horizontal win

         } else if(board[2][0] == computerSymbol && board[2][2] == computerSymbol && board[2][4] != computerSymbol && board[2][4] != playerSymbol){
             board[2][4] = computerSymbol;
         } else if(board[2][0] == computerSymbol && board[2][4] == computerSymbol && board[2][2] != computerSymbol && board[2][2] != playerSymbol){
             board[2][2] = computerSymbol;
         } else if(board[2][2] == computerSymbol && board[2][4] == computerSymbol && board[2][0] != computerSymbol && board[2][0] != playerSymbol){
             board[2][0] = computerSymbol;
             //row 2 horizontal win

         } else if(board[4][0] == computerSymbol && board[4][2] == computerSymbol && board[4][4] != computerSymbol && board[4][4] != playerSymbol){
             board[4][4] = computerSymbol;
         } else if(board[4][0] == computerSymbol && board[4][4] == computerSymbol && board[4][2] != computerSymbol && board[4][2] != playerSymbol){
             board[4][2] = computerSymbol;
         } else if(board[4][2] == computerSymbol && board[4][4] == computerSymbol && board[4][0] != computerSymbol && board[4][0] != playerSymbol){
             board[4][0] = computerSymbol;
             //row 3 horizontal win

         } else if(board[0][0] == computerSymbol && board[2][0] == computerSymbol && board[4][0] != computerSymbol && board[4][0] != playerSymbol){
             board[4][0] = computerSymbol;
         } else if(board[0][0] == computerSymbol && board[4][0] == computerSymbol && board[2][0] != computerSymbol && board[2][0] != playerSymbol){
             board[2][0] = computerSymbol;
         } else if(board[2][0] == computerSymbol && board[4][0] == computerSymbol && board[0][0] != computerSymbol && board[0][0] != playerSymbol){
             board[0][0] = computerSymbol;
             //row 1 vertical win

         } else if(board[0][2] == computerSymbol && board[2][2] == computerSymbol && board[4][2] != computerSymbol && board[4][2] != playerSymbol){
             board[4][2] = computerSymbol;
         } else if(board[0][2] == computerSymbol && board[4][2] == computerSymbol && board[2][2] != computerSymbol && board[2][2] != playerSymbol){
             board[2][2] = computerSymbol;
         } else if(board[2][2] == computerSymbol && board[4][2] == computerSymbol && board[0][2] != computerSymbol && board[0][2] != playerSymbol){
             board[0][2] = computerSymbol;
             //row 2 vertical win

         } else if(board[0][4] == computerSymbol && board[2][4] == computerSymbol && board[4][4] != computerSymbol && board[4][4] != playerSymbol){
             board[4][4] = computerSymbol;
         } else if(board[0][4] == computerSymbol && board[4][4] == computerSymbol && board[2][4] != computerSymbol && board[2][4] != playerSymbol){
             board[2][4] = computerSymbol;
         } else if(board[2][4] == computerSymbol && board[4][4] == computerSymbol && board[0][4] != computerSymbol && board[0][4] != playerSymbol){
             board[0][4] = computerSymbol;
             //row 3 vertical win

         } else if(board[0][0] == computerSymbol && board[2][2] == computerSymbol && board[4][4] != computerSymbol && board[4][4] != playerSymbol){
             board[4][4] = computerSymbol;
         } else if(board[0][0] == computerSymbol && board[4][4] == computerSymbol && board[2][2] != computerSymbol && board[2][2] != playerSymbol){
             board[2][2] = computerSymbol;
         } else if(board[2][2] == computerSymbol && board[4][4] == computerSymbol && board[0][0] != computerSymbol && board[0][0] != playerSymbol){
             board[0][0] = computerSymbol;
             //upper left diagonal win

         } else if(board[2][2] == computerSymbol && board[4][0] == computerSymbol && board[0][4] != computerSymbol && board[0][4] != playerSymbol){
             board[0][4] = computerSymbol;
         } else if(board[0][4] == computerSymbol && board[4][0] == computerSymbol && board[2][2] != computerSymbol && board[2][2] != playerSymbol){
             board[2][2] = computerSymbol;
         } else if(board[2][2] == computerSymbol && board[0][4] == computerSymbol && board[4][0] != computerSymbol && board[4][0] != playerSymbol) {
             board[4][0] = computerSymbol;
             //upper right diagonal win


        } else if(board[0][0] == playerSymbol && board[0][2] == playerSymbol && board[0][4] != computerSymbol){
            board[0][4] = computerSymbol;
         } else if(board[0][0] == playerSymbol && board[0][4] == playerSymbol && board[0][2] != computerSymbol){
             board[0][2] = computerSymbol;
         } else if(board[0][2] == playerSymbol && board[0][4] == playerSymbol && board[0][0] != computerSymbol){
             board[0][0] = computerSymbol;
         //row 1 horizontal save

         } else if(board[2][0] == playerSymbol && board[2][2] == playerSymbol && board[2][4] != computerSymbol){
             board[2][4] = computerSymbol;
         } else if(board[2][0] == playerSymbol && board[2][4] == playerSymbol && board[2][2] != computerSymbol){
             board[2][2] = computerSymbol;
         } else if(board[2][2] == playerSymbol && board[2][4] == playerSymbol && board[2][0] != computerSymbol){
             board[2][0] = computerSymbol;
         //row 2 horizontal save

         } else if(board[4][0] == playerSymbol && board[4][2] == playerSymbol && board[4][4] != computerSymbol){
            board[4][4] = computerSymbol;
         } else if(board[4][0] == playerSymbol && board[4][4] == playerSymbol && board[4][2] != computerSymbol){
            board[4][2] = computerSymbol;
         } else if(board[4][2] == playerSymbol && board[4][4] == playerSymbol && board[4][0] != computerSymbol){
            board[4][0] = computerSymbol;
         //row 3 horizontal save

         } else if(board[0][0] == playerSymbol && board[2][0] == playerSymbol && board[4][0] != computerSymbol){
            board[4][0] = computerSymbol;
         } else if(board[0][0] == playerSymbol && board[4][0] == playerSymbol && board[2][0] != computerSymbol){
            board[2][0] = computerSymbol;
         } else if(board[2][0] == playerSymbol && board[4][0] == playerSymbol && board[0][0] != computerSymbol){
            board[0][0] = computerSymbol;
         //row 1 vertical save

         } else if(board[0][2] == playerSymbol && board[2][2] == playerSymbol && board[4][2] != computerSymbol){
             board[4][2] = computerSymbol;
         } else if(board[0][2] == playerSymbol && board[4][2] == playerSymbol && board[2][2] != computerSymbol){
             board[2][2] = computerSymbol;
         } else if(board[2][2] == playerSymbol && board[4][2] == playerSymbol && board[0][2] != computerSymbol){
             board[0][2] = computerSymbol;
         //row 2 vertical save

         } else if(board[0][4] == playerSymbol && board[2][4] == playerSymbol && board[4][4] != computerSymbol){
             board[4][4] = computerSymbol;
         } else if(board[0][4] == playerSymbol && board[4][4] == playerSymbol && board[2][4] != computerSymbol){
             board[2][4] = computerSymbol;
         } else if(board[2][4] == playerSymbol && board[4][4] == playerSymbol && board[0][4] != computerSymbol){
             board[0][4] = computerSymbol;
         //row 3 vertical save

         } else if(board[0][0] == playerSymbol && board[2][2] == playerSymbol && board[4][4] != computerSymbol){
             board[4][4] = computerSymbol;
         } else if(board[0][0] == playerSymbol && board[4][4] == playerSymbol && board[2][2] != computerSymbol){
             board[2][2] = computerSymbol;
         } else if(board[2][2] == playerSymbol && board[4][4] == playerSymbol && board[0][0] != computerSymbol){
             board[0][0] = computerSymbol;
         //upper left diagonal save

         } else if(board[2][2] == playerSymbol && board[4][0] == playerSymbol && board[0][4] != computerSymbol){
             board[0][4] = computerSymbol;
         } else if(board[0][4] == playerSymbol && board[4][0] == playerSymbol && board[2][2] != computerSymbol){
             board[2][2] = computerSymbol;
         } else if(board[2][2] == playerSymbol && board[0][4] == playerSymbol && board[4][0] != computerSymbol){
             board[4][0] = computerSymbol;
         //upper right diagonal save

        } else if (board[0][0] == '1'){
             board[0][0] = computerSymbol;
         } else if (board[0][2] == '2'){
             board[0][2] = computerSymbol;
         } else if (board[0][4] == '3'){
             board[0][4] = computerSymbol;
         } else if (board[2][0] == '4'){
             board[2][0] = computerSymbol;
         } else if (board[2][2] == '5'){
             board[2][2] = computerSymbol;
         } else if (board[2][4] == '6'){
             board[2][4] = computerSymbol;
         } else if (board[4][0] == '7'){
             board[4][0] = computerSymbol;
         } else if (board[4][2] == '8'){
             board[4][2] = computerSymbol;
         } else if (board[4][4] == '9'){
             board[4][4] = computerSymbol;
         } else {
             System.out.println("No more moves! Game over!");
         }

     }

    public boolean testWin() {

         boolean isGameOver = false;

        if (board[0][0] == playerSymbol && board[0][2] == playerSymbol && board[0][4] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[0][0] == playerSymbol && board[0][4] == playerSymbol && board[0][2] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[0][2] == playerSymbol && board[0][4] == playerSymbol && board[0][0] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        //row 1 horizontal save

        } else if (board[2][0] == playerSymbol && board[2][2] == playerSymbol && board[2][4] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[2][0] == playerSymbol && board[2][4] == playerSymbol && board[2][2] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[2][2] == playerSymbol && board[2][4] == playerSymbol && board[2][0] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
            //row 2 horizontal save

        } else if (board[4][0] == playerSymbol && board[4][2] == playerSymbol && board[4][4] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[4][0] == playerSymbol && board[4][4] == playerSymbol && board[4][2] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[4][2] == playerSymbol && board[4][4] == playerSymbol && board[4][0] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
            //row 3 horizontal save

        } else if (board[0][0] == playerSymbol && board[2][0] == playerSymbol && board[4][0] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[0][0] == playerSymbol && board[4][0] == playerSymbol && board[2][0] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[2][0] == playerSymbol && board[4][0] == playerSymbol && board[0][0] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
            //row 1 vertical save

        } else if (board[0][2] == playerSymbol && board[2][2] == playerSymbol && board[4][2] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[0][2] == playerSymbol && board[4][2] == playerSymbol && board[2][2] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[2][2] == playerSymbol && board[4][2] == playerSymbol && board[0][2] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
            //row 2 vertical save

        } else if (board[0][4] == playerSymbol && board[2][4] == playerSymbol && board[4][4] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[0][4] == playerSymbol && board[4][4] == playerSymbol && board[2][4] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[2][4] == playerSymbol && board[4][4] == playerSymbol && board[0][4] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
            //row 3 vertical save

        } else if (board[0][0] == playerSymbol && board[2][2] == playerSymbol && board[4][4] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[0][0] == playerSymbol && board[4][4] == playerSymbol && board[2][2] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[2][2] == playerSymbol && board[4][4] == playerSymbol && board[0][0] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
            //upper left diagonal save

        } else if (board[2][2] == playerSymbol && board[4][0] == playerSymbol && board[0][4] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[0][4] == playerSymbol && board[4][0] == playerSymbol && board[2][2] == playerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
        } else if (board[2][2] == playerSymbol && board[0][4] == playerSymbol && board[4][0] != computerSymbol) {
            System.out.println("Game over! Player wins!");
            isGameOver = true;
            //upper right diagonal save

        } else if (board[0][0] == computerSymbol && board[0][2] == computerSymbol && board[0][4] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[0][0] == computerSymbol && board[0][4] == computerSymbol && board[0][2] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[0][2] == computerSymbol && board[0][4] == computerSymbol && board[0][0] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
            //row 1 horizontal save

        } else if (board[2][0] == computerSymbol && board[2][2] == computerSymbol && board[2][4] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[2][0] == computerSymbol && board[2][4] == computerSymbol && board[2][2] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[2][2] == computerSymbol && board[2][4] == computerSymbol && board[2][0] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
            //row 2 horizontal save

        } else if (board[4][0] == computerSymbol && board[4][2] == computerSymbol && board[4][4] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[4][0] == computerSymbol && board[4][4] == computerSymbol && board[4][2] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[4][2] == computerSymbol && board[4][4] == computerSymbol && board[4][0] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
            //row 3 horizontal save

        } else if (board[0][0] == computerSymbol && board[2][0] == computerSymbol && board[4][0] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[0][0] == computerSymbol && board[4][0] == computerSymbol && board[2][0] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[2][0] == computerSymbol && board[4][0] == computerSymbol && board[0][0] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
            //row 1 vertical save

        } else if (board[0][2] == computerSymbol && board[2][2] == computerSymbol && board[4][2] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[0][2] == computerSymbol && board[4][2] == computerSymbol && board[2][2] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[2][2] == computerSymbol && board[4][2] == computerSymbol && board[0][2] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
            //row 2 vertical save

        } else if (board[0][4] == computerSymbol && board[2][4] == computerSymbol && board[4][4] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[0][4] == computerSymbol && board[4][4] == computerSymbol && board[2][4] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[2][4] == computerSymbol && board[4][4] == computerSymbol && board[0][4] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
            //row 3 vertical save

        } else if (board[0][0] == computerSymbol && board[2][2] == computerSymbol && board[4][4] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[0][0] == computerSymbol && board[4][4] == computerSymbol && board[2][2] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[2][2] == computerSymbol && board[4][4] == computerSymbol && board[0][0] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
            //upper left diagonal save

        } else if (board[2][2] == computerSymbol && board[4][0] == computerSymbol && board[0][4] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[0][4] == computerSymbol && board[4][0] == computerSymbol && board[2][2] == computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        } else if (board[2][2] == playerSymbol && board[0][4] == playerSymbol && board[4][0] != computerSymbol) {
            System.out.println("Game over! Computer wins!");
            isGameOver = true;
        }

        return isGameOver;
    }

}







