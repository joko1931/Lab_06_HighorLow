import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int guess = 0;
        boolean inRange;
        int min = 1;
        int max = 10;

            inRange = false;
            System.out.println("Guess a number [1-10]: ");
            do
            {
                if (in.hasNextInt())
                {
                    guess = in.nextInt();

                    if (guess >= 1 && guess <= 10)
                    {
                        inRange = true;
                    }
                    else
                    {
                        System.out.println(guess + " isn't in the range listed. Please input value in the range.");
                    }
                }
                else
                {
                    System.out.println("Please enter valid input.");
                    in.nextLine();
                }
            }while (!inRange);

                int random = (int) Math.floor(Math.random() * (max - min + 1) + min);

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
}