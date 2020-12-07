

import java.util.Random;
import java.util.Scanner;

public class NimGame
{

    public int compMove(int left)
    {
    	Random r = new Random();
    	int result = r.nextInt(100 -10)+10;
    	System.out.println("Random No ->"+ result);
        return result;
    }
    
    /**
     * moves the game of nim, computer versus person
     */
    public void move()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to start.");
        int left = sc.nextInt();
        while(left>0)
        {
            int computer=compMove(left);
            System.out.println("Computer takes "+computer);
            left-=computer;
            System.out.println("Now there are "+left+" left.");
            if(left<=0)
            {
                System.out.println("Computer loose!");
                return;
            }
            System.out.println("What's your move? ");
            int person=sc.nextInt();
            if(person < left/2) {
            	
            	System.out.println("Valid Input");
            }
            while(person!=left/2 )
            {
                System.out.println(person+" not allowed, choose 1 or 2.");
                person=sc.nextInt();
            }
            left-=person;
            System.out.println("Now there are "+left+" left.");
            if(left<=0)
            {
                System.out.println("You Loose");
                return;
            }
        }
    }
    
    public static void main(String[] args)
    {
        NimGame nim=new NimGame();
        nim.move();
    }
}