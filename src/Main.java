import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int guess = 0;
        boolean numberDone = false;
        boolean done = false;
        boolean playAgain = false;
        String trash = "";
        String numTrash = "";
        int oneZero = 0;
        int min = 1;
        int max = 10;

        do
        {
            System.out.println("Guess a number [1-10]: ");
            do
            {
                if (in.hasNextInt())
                {
                    guess = in.nextInt();
                        if (guess >= 1 && guess <= 10)
                        {
                            numberDone = true;
                            int random = (int)Math.floor(Math.random() * (max - min + 1) + min);

                            if (guess > random)
                            {
                                System.out.println("Your guess was " + guess + " and the random number was " + random + ". Your guess was too high.");
                            }
                            else if (guess < random)
                            {
                                System.out.println("Your guess was " + guess + " and the random number was " + random + ". Your guess was too low.");
                            }
                            else
                            {
                                System.out.println("Your guess was " + guess + " and the random number was " + random + ". Your guess was on the money!");
                            }
                        }
                        else
                        {
                            numTrash = in.nextLine();
                            System.out.println("While " + numTrash + " is a number, it isn't in the range. Please try again.");
                        }
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("Please enter valid value, not " + trash);
                }
            }while(!numberDone);
                System.out.println("Do you want to play again [1/0]?");
                if (in.hasNextInt())
                {
                    oneZero = in.nextInt();
                    if (oneZero == 0)
                    {
                        done = true;
                    }
                }
        }while(!done);
    }
}