package fr.lernojo.guessgame;

import fr.lernojo.logger.ConsoleLogger;
import fr.lernojo.logger.Logger;
import fr.lernojo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("player");
    @Override
    public long askNextGuess() {
        logger.log("Enter your choice");
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
