import java.util.*;
import java.math.*;
class Guess_the_number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int num=rand.nextInt(10);
        int chance=3;
        System.out.println("**********WELCOME TO THE NUMBER GUESSING GAME**********");
        System.out.println("          RULES OF THIS GAME                           \n"+
        "1)you have to guess a number in between 0 to 10\n"+
        "2)you have 3 chances to guess the number\n"+
        "Now let's start the game  :)  ");
        System.out.println("Give me the number which you've guessed ");
        int guess=sc.nextInt();
        if(guess>10 || guess<0)
        {
            System.out.println("Oops!! try to guess within the range");
        }
        if(guess==num)
        System.out.println("Awesome you guessed it correct on your first time!!!!");
        else if(guess!=num)
        {
            System.out.println("Nah!!! wrong answer");
            chance-=1;
        }
        System.out.println("Let's try again");
        int guess2=sc.nextInt();
        if(guess2>10 || guess2<0)
        {
            System.out.println("Oops!! try to guess within the range");
        }
        if(guess2==num)
        System.out.println("Awesome you guessed it correct on your first time!!!!");
        else if(guess2!=num)
        {
            System.out.println("Nah!!! wrong answer again one chance left");
            chance-=1;
        }
        int guess3=sc.nextInt();
        if(guess3>10 || guess3<0)
        {
            System.out.println("Oops!! try to guess within the range");
        }
        if(guess3==num)
        System.out.println("Awesome you guessed it correct on your first time!!!!");
        else if(guess3!=num)
        {
            System.out.println("Nah!!! wrong answer again....sorry");
            chance-=1;
        }
        if(chance==0)
        {
            System.out.println("game ends!:)");
        }

    }
}