package fr.lernojo.guessgame;

import fr.lernojo.logger.Logger;
import fr.lernojo.logger.LoggerFactory;

import java.security.SecureRandom;

public class ComputerPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("ComputerPlayer");

    @Override
    public long askNextGuess() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(100);
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater)
            logger.log("The entered number is lower than the number");
        else
            logger.log("the entered number is greater than the number");
    }
}
