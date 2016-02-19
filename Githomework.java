/**
 * Group Memebers: 
 * Christian Torices
 * 
 * Homework 3: Git Hub Assignment
 * COSC 481W
 * 2/18/2016
 * 
 */
package githomework;
import java.util.*;

public class Githomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        display();
        
        
        
    }
     public static enum game {
        ROCK, 
        PAPER, 
        SCISSOR, 
        LIZZARD, 
        SPOCK,
        QUIT
    }
     public static game input() {
         game temp = game.LIZZARD;
         Scanner keyboard = new Scanner(System.in);
         temp = game.valueOf(keyboard.next().toUpperCase());
         //keyboard.close();
         return temp;
     }
    public static void choice(game choice){
      Random rand = new Random();
      rand.setSeed(0);
    
      
        game aiChoice;
        aiChoice = game.values()[rand.nextInt((3-0) + 1)+ 0];
       
        switch(choice) {
            case ROCK:
                if(aiChoice == game.ROCK)
                    System.out.println("Tie");
                else if(aiChoice == game.PAPER)
                    System.out.println("Lose");
                else if(aiChoice == game.SCISSOR)
                    System.out.println("Win");
         
                break;
            case PAPER:
                if(aiChoice == game.ROCK)
                    System.out.println("Win");
                else if(aiChoice == game.PAPER)
                    System.out.println("Tie");
                else if(aiChoice == game.SCISSOR)
                    System.out.println("Lose");
                break;
            case SCISSOR:
                if(aiChoice == game.ROCK)
                    System.out.println("Lose");
                else if(aiChoice == game.PAPER)
                    System.out.println("Win");
                else if(aiChoice == game.SCISSOR)
                    System.out.println("Tie");
                break;               
            default:
                System.out.println("Nope not a option");
                break;
        }
        
    }
   
    public static void display(){
        game isDone;
            
        while(true){
            System.out.println("Rock Paper Scissor Lizzard Spock");
            System.out.println("Menu:");
            System.out.println("Rock");
            System.out.println("Paper");
            System.out.println("Scissor");
            System.out.println("Quit");
            isDone = input();
           if( isDone == game.QUIT)
               break;
           choice(isDone);
        }
    }
}
