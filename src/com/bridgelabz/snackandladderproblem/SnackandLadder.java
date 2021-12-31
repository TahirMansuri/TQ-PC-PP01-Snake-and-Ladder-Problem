package com.bridgelabz.snackandladderproblem;

public class SnackandLadder {

    //Declaring Variables for Players Position
    int playerPosition = 0;

    //Method to Show Player Current Position
    private void showPosition() {
        //Displaying Player Position
        System.out.println("Player Starting Position = "+ playerPosition);
    }
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Snake and Ladder Simulator Problem Developed by Tahir Mansuri.");

        //Creating Object for Player
        SnackandLadder player1 = new SnackandLadder();

        //Showing Player Position
        player1.showPosition();
    }
}
