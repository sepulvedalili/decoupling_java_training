package fr.lernojo.guessgame;

import fr.lernojo.logger.Logger;
import fr.lernojo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
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

    public void loopUntilPlayerSucceed() {
        while(!this.nextRound()){
        }
    }

}
