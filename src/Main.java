import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String responseA, responseB;
        boolean done = false;
        String wish = "";

        Scanner in = new Scanner(System.in);
        System.out.println("lets play the game of Rock Paper and Scissors");
        System.out.println("Players need to press r or R for Rock, p or P for Paper and s or S for Scissors");
        do {
            System.out.println("Player A: Choose your Move: ");
            responseA = in.nextLine();
            while(!responseA.equalsIgnoreCase("R") && !responseA.equalsIgnoreCase("S") && !responseA.equalsIgnoreCase("P")){
                System.out.println("Invalid Input!!");
                System.out.println("Choose you move again: ");
                responseA = in.nextLine();
            }

            System.out.println("Player B: Choose your Move: ");
            responseB = in.nextLine();
            while(!responseB.equalsIgnoreCase("R") && !responseB.equalsIgnoreCase("S") && !responseB.equalsIgnoreCase("P")){
                System.out.println("Invalid Input!!");
                System.out.println("Choose you move again: ");
                responseB = in.nextLine();
            }

                if(responseA.equalsIgnoreCase(responseB)){
                    System.out.println(responseA + " vs " + responseB + " its a tie!");
                } else if (responseA.equalsIgnoreCase("R") && responseB.equalsIgnoreCase("S")) {
                    System.out.println(responseA + " breaks " + responseB + " Player A Wins");
                } else if (responseA.equalsIgnoreCase("P") && responseB.equalsIgnoreCase("R")) {
                    System.out.println(responseA + " covers " + responseB + " Player A Wins");
                } else if (responseA.equalsIgnoreCase("S") && responseB.equalsIgnoreCase("P")) {
                    System.out.println(responseA + " cuts " + responseB + " Player A Wins");
                } else if (responseB.equalsIgnoreCase("R") && responseA.equalsIgnoreCase("S")){
                    System.out.println(responseB + " breaks " + responseA + " Player B Wins");
                } else if (responseB.equalsIgnoreCase("P") && responseA.equalsIgnoreCase("R")){
                    System.out.println(responseB + " covers " + responseA + " Player B Wins");
                } else if (responseB.equalsIgnoreCase("S") && responseA.equalsIgnoreCase("P")) {
                    System.out.println(responseB + " cuts " + responseA + " Player B Wins");
                } else {
                    System.out.println("Invalid Input!!");
                }
            System.out.println("Do you wish to play again (Y/N)");
            wish = in.nextLine();
            if(wish.equalsIgnoreCase("N")){
                done = true;
            }
        }while(!done);
    }
}