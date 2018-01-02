package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to my tic tac toe game! You'll play as X's and I'll play as O's. Got it? (Y/N)");
        Scanner consentInput = new Scanner(System.in);
        char consent = consentInput.next().charAt(0);

        if (consent == 'y' || consent == 'Y'){
            System.out.println("Sweet! Take a look at the board. Spaces with numbers are places where you can play.");
            Board init = new Board();
            init.printBoard();

            if(!init.testWin()) {
                System.out.println("Tell me the coordinate of your first X.");
                Scanner firstMoveInput = new Scanner(System.in);
                int firstMove = firstMoveInput.nextInt();
                init.playerMove(firstMove);
                init.testWin();

                if (!init.testWin()) {
                    System.out.println("\n" + "Tell me your next coordinate.");
                    Scanner secondMoveInput = new Scanner(System.in);
                    int secondMove = secondMoveInput.nextInt();
                    init.playerMove(secondMove);
                    init.testWin();

                    if (!init.testWin()) {
                        System.out.println("\n" + "Tell me your next coordinate.");
                        Scanner thirdMoveInput = new Scanner(System.in);
                        int thirdMove = thirdMoveInput.nextInt();
                        init.playerMove(thirdMove);
                        init.testWin();

                        if (!init.testWin()) {
                            System.out.println("\n" + "Tell me your next coordinate.");
                            Scanner fourthMoveInput = new Scanner(System.in);
                            int fourthMove = fourthMoveInput.nextInt();
                            init.playerMove(fourthMove);
                            init.testWin();

                            if (!init.testWin()) {
                                System.out.println("\n" + "Tell me your next coordinate.");
                                Scanner fifthMoveInput = new Scanner(System.in);
                                int fifthMove = fifthMoveInput.nextInt();
                                init.playerMove(fifthMove);
                                init.testWin();
                            }
                        }
                    }
                }
            }

        } else if(consent == 'n' || consent == 'N'){
            System.out.println("Oh okay, see ya.");
        } else {
            System.out.println("Dummy that's not one of the choices! Try again!");
        }



    }
}
