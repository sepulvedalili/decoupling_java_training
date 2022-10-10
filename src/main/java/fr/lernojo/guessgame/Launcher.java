package fr.lernojo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(){
        HumanPlayer humanPlayer = new HumanPlayer();
        Simulation simulation = new Simulation(humanPlayer);

        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        simulation.initialize(randomNumber);

        simulation.loopUntilPlayerSucceed();

    }

}
