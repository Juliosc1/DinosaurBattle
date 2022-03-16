package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("::::::::::::::::::::");
        System.out.println("T-REX VS TRICERATOPS");
        int trex = 100;
        int tri = 100;
        int level = 1;

        ArrayList<Integer> scoreList = new ArrayList<>(Arrays.asList(0, 10, 20, 40));
        ArrayList<Integer> scoreListTrex = new ArrayList<>(Arrays.asList(0, 10, 20, 40));
        String [] moves = {"bite", "punch", "kick"};

        System.out.println("Bite, punch or kick");
        while (true){
            int randomScore = (int)(Math.random()*4);

            System.out.print("Enter your move: ");
            String yourMove = input.nextLine();
            System.out.println(" ");

            if(yourMove.equalsIgnoreCase(moves[0])) {
                System.out.println("T-REX: Bit the Triceratops");
            } else if (yourMove.equalsIgnoreCase(moves[1])) {
                System.out.println("T-REX: Punched the Triceratops");
            } else if (yourMove.equalsIgnoreCase(moves[2])) {
                System.out.println("T-REX: Kicked the Triceratops");
            }

            if(scoreList.get(randomScore)==0){
                System.out.println("Missed, the attack failed");
            }

            System.out.println("triceratops lost: "+scoreList.get(randomScore)+" point in healt");
            tri = tri - scoreList.get(randomScore);
            System.out.println(" ");

            if(tri < 1){
                System.out.println(":::YOU WIN:::");
                break;
            }

            int randomMove = (int)(Math.random()*3);
            int randomScoreTrex = (int)(Math.random()*4);

            if(randomMove==0){
                System.out.println("TRICERATOPS: Bit your T-rex");
            } else if(randomMove==1){
                System.out.println("TRICERATOPS: Punched your T-rex");
            } else if(randomMove==2){
                System.out.println("TRICERATOPS: Kicked your T-rex");
            }

            if(scoreListTrex.get(randomScoreTrex)==0){
                System.out.println("Missed, the attack failed");
            }

            System.out.println("T-rex lost: "+scoreListTrex.get(randomScoreTrex)+" point in healt");
            trex = trex - scoreListTrex.get(randomScoreTrex);

            if(trex < 1){
                System.out.println(":::GAME OVER:::");
                break;
            }

            level++;
            System.out.println(":::::::SCORE:::::::");
            System.out.println("Triceratops: "+tri+"/100");
            System.out.println("T-rex: "+trex+"/100");
            System.out.println(":::::::::::::::::::");
            System.out.println("Next round: "+level);
        }

    }
}
