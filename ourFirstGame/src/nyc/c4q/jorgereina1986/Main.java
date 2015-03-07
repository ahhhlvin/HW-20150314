package nyc.c4q.jorgereina1986;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String first;
        String second;
        String third;

        System.out.println("Your plane crashed and you landed in the jungle. You find a cave near by. Do you want to go in? [Y / N]");
        first = input.next();

        if (first.equals("Y")) {
            System.out.println("You have encountered a cyclops and he killed you! GAME OVER");
        } else if (first.equals("N"));


            System.out.println("You continue walking towards the river and find an abandoned boat. Do you want to get in? [Y / N]");
            second = input.next();
            if (second.equals("Y")) {
                System.out.println("You get in the boat and then the boat hits some rocks ahead and it sinks with you in it! GAME OVER");
            } else if (second.equals("N")); {

                System.out.println("You continue to venture through the forest and find an old man sitting under a tree that is located nearby, would you like to speak with him? [Y / N]");
                third = input.next();
                if (third.equals("Y")) {
                    System.out.println("You go up to the old man and ask him if he known of a nearby city that you can go to for food. He says that there ");
            }


    }

    }
}
