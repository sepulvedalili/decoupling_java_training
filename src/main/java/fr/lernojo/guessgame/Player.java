package fr.lernojo.guessgame;

public interface Player {
    long askNextGuess();
    void respond(boolean lowerOrGreater);
}
