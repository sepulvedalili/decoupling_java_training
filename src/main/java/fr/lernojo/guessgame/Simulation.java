package fr.lernojo.guessgame;

import fr.lernojo.logger.Logger;
import fr.lernojo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("Simulation");
    private final Player player;
    private long numberToGuess;


    public Simulation(Player player) {
        this.player = player;
        //TODO implement me
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
        //TODO implement me
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long number = player.askNextGuess();

        if (number==numberToGuess){
            logger.log("You guessed the right number");
            return true;
        }

        player.respond(number<numberToGuess);
        return false;
    }

    public void loopUntilPlayerSucceed(long maxIter) {
        long i = 0;
        long start = System.currentTimeMillis();
        boolean response;

        do{
            response = this.nextRound();
            if (i>=maxIter)
                break;
            i++;
        }while(!response);

        long end = System.currentTimeMillis();
        long gameTime = end - start;
        long minutes = gameTime / 60000;
        gameTime %= 60000;
        long seconds = gameTime / 1000;
        gameTime %= 1000;
        long milliseconds = gameTime;
        logger.log(String.format("%02d:%02d.%d", minutes, seconds, milliseconds));
        if (response)
            logger.log("The player win");
        else
            logger.log("The player lose");

    }

}
