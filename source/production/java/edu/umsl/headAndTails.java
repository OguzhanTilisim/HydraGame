package edu.umsl;
import java.util.*;
public class headAndTails {
    static int select;
    static int head, tail;
    public static void main(String[] args){
        try {
            Scanner scan = new Scanner(System.in);
            int move;
            System.out.println("Game starting, Game name is Hydra vs Knight!");
            System.out.println("There are rules, you should read them!");
            //I read rules here
            System.out.println("First move ,you can cut off exactly one of Hydra’s heads.\n" + "Second move, you can cut off exactly one of Hydra’s tails.\n" + "Third move, you can cut off exactly two of Hydra’s heads.\n" + "Fourth move, you can cut off exactly two of Hydra’s tails.\n");
            System.out.println("\n If you cut off exactly one head, a new head grows immediately.\n" +"If you cut off exactly one tail, two new tails grow immediately.\n"+ "If you cut off exactly two tails, a new head grows immediately.\n"+"If you cut off exactly two heads, nothing happens.\n");
            //I will ask how many round will be
            System.out.println("How many head would you like to get?");
            head= scan.nextInt();
            System.out.println("How many tail would you like to get?");
            tail= scan.nextInt();
            // we are going to create the game
            while (head > 0 || tail > 0) {
                //I will do menu
                System.out.println("Press 1: First move ,you can cut off exactly one of Hydra’s heads.\n" + "Press 2: Second move, you can cut off exactly one of Hydra’s tails.\n" + "Press 3: Third move, you can cut off exactly two of Hydra’s heads.\n" + "Press 4: Fourth move, you can cut off exactly two of Hydra’s tails.\n" + "Press 5: For Quit ! \n");
                System.out.println("Select move: ");
                move=scan.nextInt();
                if (move >0 && move < 6){
                    if (move ==5) {
                        select = -1;
                        break;
                    } else if (move ==1) {
                        if (head > 0) {
                            select++;
                        } else {
                            System.out.println("There is no move,No Hydra head left! ");
                        }
                }
            else if (move ==2) {
                if (tail >0) {
                    select++;
                    tail++;
                } else {
                    System.out.println("There is no move,No Hydra tail left! ");
                }
                    }
            else if (move== 3) {
                        if (head >=2) {
                            select++;
                            head = head -2;
                        } else {
                            System.out.println("There is no move!");
                        }
                    } else {
                if (tail > 1) {
                        select++;
                        tail = tail -2;
                        head++;
                    } else {
                        System.out.println("There is no move, No Hydra head left! ");
                    }
                    }
                    } else {
                    System.out.println("There is no validation moves!\n");
                }
                System.out.println("Hydra Head= "+head+ "Hydra Tail= "+tail+ "Ramaining");
            }
            if (select==-1)
                System.out.println("Did you win? ");
            else {
                System.out.println("You finally killed the Hydra, and you spent " + select + " moves!");
            }

        } catch (Exception e){
            System.out.println("Error is " + e);
        }
    }
}