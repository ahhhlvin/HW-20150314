package nyc.c4q.jorgereina1986;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String first;
        String second;
        String third;
        String fourth;
        String fifth;



        System.out.println("The plane you were riding in crashes and you find yourself in a jungle. You locate a cave nearby. Do you want to go in? [Y / N]");
        first = input.next();

        if (first.equals("Y")) {
            System.out.println("You have encountered a cyclops and he killed you! GAME OVER");
        } else if (first.equals("N"))
        {
            System.out.println("You continue walking, notice a river nearby and begin walking along it. Along the way you find an abandoned boat. Do you want to get in and take off down the river? [Y / N]");
            second = input.next();
            if (second.equals("Y")) {
                System.out.println("You get in the boat and then the boat hits some rocks ahead and it sinks with you in it! GAME OVER");
            } else if (second.equals("N"))
            {

                System.out.println("You continue to venture through the forest and find an old man sitting under a tree that is located nearby, would you like to speak with him? [Y / N]");
                third = input.next();
                if (third.equals("Y")) {
                    System.out.println("You go up to the old man and ask him if he knows of a nearby city where you could go for some food. He says that there is a town not too far away from here and that he can lead you there, would you like to follow him? [Y / N]");
                    fourth = input.next();
                    if (fourth.equals("Y")) {
                        System.out.println("You follow the elderly man and find yourself entering a dark tunnel, suddenly the old man whips out a knife, stabs you, and mugs you. GAME OVER");
                    } else if (fourth.equals("N"))
                    {
                        System.out.println("You continue walking on your own and notice a wooden chest peeking out from under some bushes nearby, would you like to check it out? ");
                        fifth = input.next();

                        if (fifth.equals("N")) {
                            System.out.println("You continue on your path and find out that the path has somehow turned into quicksand! You struggle to find a nearby object to pry yourself out, however, there is nothing nearby that is close enough so you end up sinking. GAME OVER");
                        } else if (fifth.equals("Y")) {
                            System.out.println("You approach and chest and realize it is a magical box, you proceed to open it and are magically transported back to your arrival destination! You have survived, hooray YOU WIN!");
                        }

                    }
                }


            }

        }
    }
}
