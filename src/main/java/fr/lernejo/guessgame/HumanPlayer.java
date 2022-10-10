package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("HumanPlayer");
    @Override
    public long askNextGuess() {

        logger.log("Enter your choice :  ");
        Scanner scan=new Scanner(System.in);
        return scan.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater)
            logger.log("The entered number is lower than the number");
        else
            logger.log("the entered number is greater than the number");
    }
}
